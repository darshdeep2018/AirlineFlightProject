package com.example.AirlineFlight;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class UserController {
	@PostMapping(value = "/admin/login")
	void loginAdmin(@PathVariable String userName, @PathVariable String password) {
		System.out.println("Invalid login called");
	}
}
