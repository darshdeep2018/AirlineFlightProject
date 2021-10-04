package com.example.AirlineFlight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/flight")
public class AdminController {
	@Autowired
	AdminService adminService;
	String userName="Ram";
	String password="1234";
	@PostMapping(value = "/admin/login")
	String loginAdmin(@RequestBody Admin admin) {
		if((userName.equals(admin.getUserName())&&(password.equals(admin.getPassword())))) {
				admin.setStatus(true);
				return "Successfully Logged In";
		}
		return "Invalid Login details";
	}

	@PostMapping(value = "/airline/register")
	String bookingAirline(@RequestBody Airline airline) {
		adminService.save(airline);
		return "Successfully Added";
	}
}
