package com.appsdeveloperblog.app.ws.shared;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Utils {
	
	private final Random RANDOM = new SecureRandom();
	private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVXYZabcdefghijklmnopqrstuvxyz";
	
	public String generateUserId(int lenght) {
		return generateRandomString(lenght);
	}
	
	private String generateRandomString(int lenght) {
		StringBuilder returnValue = new StringBuilder(lenght);
		
		for (int i = 0; i < lenght; i++) {
			returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
		}
		
		return new String(returnValue);
	}

}
