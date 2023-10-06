package com.nareshit.notification.system.service;

import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService implements NotificationService {
	
	@Override
	public void sendNotification() {
		System.out.println("SMS Notification sent successfully");
	}

}
