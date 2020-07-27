package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service("testService1")
public class TestServiceBeanOne implements TestService{

	@Override
	public void doSomething() {
		
		System.out.println("I am inside doSomething() of TestServiceBeanOne");		
	}
	

}
