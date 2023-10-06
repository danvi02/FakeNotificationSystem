package com.nareshit.notification.system.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.notification.system.service.NotificationService;

@RestController
@RequestMapping("/notifications")
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

	@GetMapping("/email")
	public String triggerNotification() {
		this.emailNotificationService.sendNotification();
		return "Email Sent successfully.";
	}

}
