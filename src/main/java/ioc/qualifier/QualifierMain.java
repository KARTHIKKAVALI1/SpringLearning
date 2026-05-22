package ioc.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QualifierMain implements CommandLineRunner {

    @Autowired
    @Qualifier("googlePay") // here spring internally converts into GooglePay
    Payment payment;

    public static void main(String[] args) {

        SpringApplication.run(QualifierMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        payment.pay();
    }
}