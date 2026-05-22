package ioc.qualifier;

import org.springframework.stereotype.Component;

@Component
public class GooglePay implements Payment{
	public void pay() {
		System.out.println("Payment from GooglePay");
	}
}
