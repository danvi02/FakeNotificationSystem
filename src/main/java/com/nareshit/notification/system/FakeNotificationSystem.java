package com.nareshit.notification.system;

import com.nareshit.notification.system.api.NotificationAPI;
import com.nareshit.notification.system.service.EmailNotificationService;
import com.nareshit.notification.system.service.NotificationService;

public class FakeNotificationSystem {
	public static void main(String[] args) {
		NotificationAPI notificationAPI = new NotificationAPI();
		NotificationService emailNotificationService  = new EmailNotificationService();
		
		notificationAPI.setEmailNotificationService(emailNotificationService);
		notificationAPI.triggerNotification();
	}
}
