package com.nareshit.notification.system.api;

import com.nareshit.notification.system.service.NotificationService;
import lombok.Setter;

@Setter
public class NotificationAPI {
	/*
	 * SOLID -> Dependency Inversion Principle(Loose Coupling between
	 * NotificationAPI and NotificationService Classes)
	 */
	private NotificationService emailNotificationService;

	public String triggerNotification() {
		this.emailNotificationService.sendNotification();
		return "Email Sent successfully.";
	}

}
