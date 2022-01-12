package com.example.alert;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sms")
public class SMSAlertService implements AlertService {

	@Override
	public void getAlert() {

		System.out.println("SMSAlertService.getAlert():: SMS Alert Services");
	}
}