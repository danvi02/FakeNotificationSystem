package com.nareshit.notification.system.service;

public class SMSNotificationService implements NotificationService {
	
	@Override
	public void sendNotification() {
		System.out.println("SMS Notification sent successfully");
	}

}
