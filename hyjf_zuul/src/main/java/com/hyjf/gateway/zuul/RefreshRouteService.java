package com.hyjf.gateway.zuul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.RoutesRefreshedEvent;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author xiasq
 * @version RefreshRouteService, v0.1 2018/4/13 10:08
 */
@Service
public class RefreshRouteService {

	@Autowired
	ApplicationEventPublisher publisher;

	@Autowired
	RouteLocator routeLocator;

	@PostConstruct
	public void openTimeTaskThread() {
		ScheduledExecutorService timer = Executors.newSingleThreadScheduledExecutor();
		// 延时 1 秒后，按 3 秒的周期执行任务
		timer.scheduleAtFixedRate(() -> refreshRoute(), 1000, 3000, TimeUnit.MILLISECONDS);
	}

	public void refreshRoute() {
		RoutesRefreshedEvent routesRefreshedEvent = new RoutesRefreshedEvent(routeLocator);
		publisher.publishEvent(routesRefreshedEvent);
	}
}
