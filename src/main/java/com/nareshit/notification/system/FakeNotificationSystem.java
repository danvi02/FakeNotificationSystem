package com.nareshit.notification.system;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nareshit.notification.system.api.NotificationAPI;

@Configuration
@ComponentScan
public class FakeNotificationSystem {
	public static void main(String[] args) {
		ApplicationContext applicationContextFactory = new AnnotationConfigApplicationContext(
				FakeNotificationSystem.class);
		
		NotificationAPI notificationAPI = applicationContextFactory.getBean(NotificationAPI.class);
		notificationAPI.triggerNotification();
		
	}
}
