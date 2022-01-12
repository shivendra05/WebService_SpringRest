package com.example.alert;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class EmailAlertService implements AlertService {

	@Override
	public void getAlert() {

		System.out.println("EmailAlertService.getAlert():: Email Alert Services");
	}
}