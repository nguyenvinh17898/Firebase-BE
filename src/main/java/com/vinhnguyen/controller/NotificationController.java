package com.vinhnguyen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinhnguyen.service.NotificationService;

@RestController
@RequestMapping("/notification")
public class NotificationController {

	@Autowired
	private NotificationService notificationService;

	@PostMapping("/sendMessage")
	public String sendPnsToDevice(@RequestParam("token") String token, @RequestParam("title") String title,
			@RequestParam("text") String text) {
		return notificationService.sendPnsToDevice(token, title, text);
	}
}
