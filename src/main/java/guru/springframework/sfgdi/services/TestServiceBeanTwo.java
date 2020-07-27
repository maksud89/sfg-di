package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service("testService2")
public class TestServiceBeanTwo implements TestService {

	@Override
	public void doSomething() {
		System.out.println("I am inside doSomething() of TestServiceBeanTwo");
		
	}
	

}
