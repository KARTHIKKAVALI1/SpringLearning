package transcationManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BankDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void transferMoney() {

        // Deduct money from account 1
        jdbcTemplate.update(
                "update accounts set balance = balance - 1000 where id = ?",
                1
        );

        System.out.println("Money deducted");

        // Force exception
        int x = 10 / 0;

        // Add money to account 2
        jdbcTemplate.update(
                "update accounts set balance = balance + 1000 where id = ?",
                2
        );

        System.out.println("Money added");
    }
}