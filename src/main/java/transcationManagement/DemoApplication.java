package transcationManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(DemoApplication.class, args);

        BankDAO dao = context.getBean(BankDAO.class);

        try {
            dao.transferMoney();
        }
        catch (Exception e) {
            System.out.println("Transaction Rolled Back");
        }
    }
}