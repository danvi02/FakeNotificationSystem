package com.nareshit.notification.system.service;

public class EmailNotificationService implements NotificationService{
	
	@Override
	public void sendNotification() {
		System.out.println("Email sent successfully");
	}
}
