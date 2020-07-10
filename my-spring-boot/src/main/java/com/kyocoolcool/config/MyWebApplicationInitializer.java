package com.kyocoolcool.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className MyWebApplicationInitializer
 * @description
 * @date 2020/7/9 3:24 PM
 **/

public class MyWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletCxt) {
		System.out.println("有啟動");
		// Load Spring web application configuration
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(RootConfig.class);
		ac.refresh();
		System.out.println("啟動之後");
		// Create and register the DispatcherServlet
		DispatcherServlet servlet = new DispatcherServlet(ac);
		ServletRegistration.Dynamic registration = servletCxt.addServlet("app", servlet);
		registration.addMapping("/");
		registration.setLoadOnStartup(1);
	}
}
