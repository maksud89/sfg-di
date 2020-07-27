package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.TestService;

@Controller
public class TestController {
	
	//Using property
	@Autowired
	@Qualifier("testService1")
	TestService service;

	//Using Constructor
	/*
	 * public TestController(@Qualifier("testService2")TestService service) {
	 * super(); this.service = service; }
	 */
	public void triggerTestFunction() {
		service.doSomething();
	}

}
