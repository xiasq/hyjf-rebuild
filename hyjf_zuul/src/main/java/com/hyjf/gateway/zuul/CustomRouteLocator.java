package com.hyjf.gateway.zuul;

import com.hyjf.gateway.service.IamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.cloud.netflix.zuul.filters.RefreshableRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties.ZuulRoute;
import org.springframework.util.StringUtils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiasq
 * @version CustomRouteLocator, v0.1 2018/4/13 9:46
 */
public class CustomRouteLocator extends SimpleRouteLocator implements RefreshableRouteLocator {
	public final static Logger logger = LoggerFactory.getLogger(CustomRouteLocator.class);
	private ZuulProperties properties;
	private IamService iamService;
	private Flag flag;

	@Override
	public void refresh() {
		if (!flag.isFlag()) {
			flag.setFlag(true);
			doRefresh();
		}
	}

	public CustomRouteLocator(String servletPath, ZuulProperties properties) {
		super(servletPath, properties);
		this.properties = properties;
		logger.info("servletPath:{}", servletPath);
	}

	@Override
	protected Map<String, ZuulRoute> locateRoutes() {
		LinkedHashMap<String, ZuulRoute> routesMap = new LinkedHashMap<String, ZuulRoute>();
		// 从application.properties中加载路由信息
		routesMap.putAll(super.locateRoutes());
		// 加载路由信息
		routesMap.putAll(locateRoutesFromIAM());
		// 优化一下配置
		LinkedHashMap<String, ZuulRoute> values = new LinkedHashMap<String, ZuulRoute>();
		for (Map.Entry<String, ZuulRoute> entry : routesMap.entrySet()) {
			String path = entry.getKey();
			// Prepend with slash if not already present.
			if (!path.startsWith("/")) {
				path = "/" + path;
			}
			if (StringUtils.hasText(this.properties.getPrefix())) {
				path = this.properties.getPrefix() + path;
				if (!path.startsWith("/")) {
					path = "/" + path;
				}
			}
			values.put(path, entry.getValue());
		}
		return values;
	}

	private Map<String, ZuulRoute> locateRoutesFromIAM() {
		logger.info("load zuul routes from IAM");
		Map<String, ZuulRoute> routes = new LinkedHashMap<String, ZuulRoute>();
		List<GatewayApiConfigVO> results = iamService.findGatewayConfigs();
		for (GatewayApiConfigVO result : results) {
			ZuulRoute zuulRoute = new ZuulRoute();
			try {
				BeanUtils.copyProperties(result, zuulRoute);
			} catch (Exception e) {
				logger.error("load zuul routes from IAM error", e);
			}
			routes.put(zuulRoute.getPath(), zuulRoute);
		}
		return routes;
	}

    public void setIamService(IamService iamService) {
        this.iamService = iamService;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }
}
