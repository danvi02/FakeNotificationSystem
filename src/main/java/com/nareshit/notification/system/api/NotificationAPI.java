package com.nareshit.notification.system.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nareshit.notification.system.service.NotificationService;

@Component
public class NotificationAPI {
	/*
	 * SOLID -> Dependency Inversion Principle(Loose Coupling between
	 * NotificationAPI and NotificationService Classes)
	 */
	
	/*
	 * Reflection API mechanism to access this variable and inject or set
	 * notificationService variable with impl object present in applicationContext
	 * factory
	 */
	@Autowired
	private NotificationService emailNotificationService;

	public String triggerNotification() {
		this.emailNotificationService.sendNotification();
		return "Email Sent successfully.";
	}

}
