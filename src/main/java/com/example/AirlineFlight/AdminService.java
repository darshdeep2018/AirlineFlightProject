package com.example.AirlineFlight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	@Autowired
	AdminRepository adminRepository;

	public void save(Airline airline) {
		adminRepository.save(airline);
		System.out.println(airline);
	}
}
