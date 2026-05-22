package ioc.qualifier;

import org.springframework.stereotype.Component;

@Component
public class PhonePay implements Payment{
	public void pay() {
		System.out.println("From PhonePay");
	}
}
