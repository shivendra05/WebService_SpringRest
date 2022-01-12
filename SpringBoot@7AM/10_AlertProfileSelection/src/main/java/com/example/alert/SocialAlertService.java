package com.example.alert;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("social")
public class SocialAlertService implements AlertService {

	@Override
	public void getAlert() {

		System.out.println("SocialAlertService.getAlert():: Social Alert Services");
	}
}