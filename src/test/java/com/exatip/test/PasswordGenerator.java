package com.exatip.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
public class PasswordGenerator {
	@Test
	public void pwd() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "admin";
		String encodedPassword = encoder.encode(rawPassword);

		System.out.println(encodedPassword);
	}

}
