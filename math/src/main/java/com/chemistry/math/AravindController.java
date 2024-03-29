package com.chemistry.math;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AravindController {
	
	
	@Autowired
	private WelcomeService service;
	

	@RequestMapping("/welcome")
	public String welcome()
	{
		return service.retrieveWelcomeMessage();
	}
	
}

@Component
class WelcomeService{
	public String retrieveWelcomeMessage() {
		return "Good Morning Aravind";
	}
}

