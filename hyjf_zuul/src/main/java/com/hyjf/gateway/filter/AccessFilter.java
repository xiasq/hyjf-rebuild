package com.hyjf.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xiasq
 * @version AccessFilter, v0.1 2018/4/13 9:35
 */
public class AccessFilter extends ZuulFilter {
	private static Logger logger = LoggerFactory.getLogger(AccessFilter.class);

	/***
	 * Filter的生命周期 ： PRE、ROUTING、POST、ERROR
	 * 
	 * @return
	 */
	@Override
	public String filterType() {
		return "pre";
	}

	/**
	 * 定义filter的顺序，数字越小表示顺序越高，越先执行
	 * 
	 * @return
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

	/**
	 * 表示是否需要执行该filter，true表示执行，false表示不执行
	 * 
	 * @return
	 */
	@Override
	public boolean shouldFilter() {
		RequestContext ctx = RequestContext.getCurrentContext();
		String requestUri = ctx.getRequest().getRequestURI();
		boolean shoudFilter = requestUri.contains("api/sign");
		logger.info("uri:" + requestUri + " " + shoudFilter);
		if (!shoudFilter) {
			shoudFilter = requestUri.contains("secure");
		}
		return shoudFilter;
	}

	/**
	 * 将sign token 之类的转换成userId
	 * 
	 * @return
	 */
	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		logger.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

		String sign = request.getHeader("sign");
		if (sign == null) {
			logger.error("sign is empty");
            ctx.setSendZuulResponse(false); //不对其进行路由
            ctx.setResponseStatusCode(400);
			ctx.setResponseBody("sign is empty");
			return null;
		}

		String userId = String.valueOf(sign);
        ctx.setSendZuulResponse(true); //对请求进行路由
        ctx.setResponseStatusCode(200);
		ctx.addZuulRequestHeader("userId", userId);
		logger.info(String.format("user sign:%s userId:%s", sign, userId));
		return null;
	}
}
