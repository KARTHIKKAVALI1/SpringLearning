package jdbc;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class MyRunner implements CommandLineRunner {

    private StudentDAO dao;

    public MyRunner(StudentDAO dao) {
        this.dao = dao;
    }

    public static void main(String[] args) {

        SpringApplication.run(
                MyRunner.class,
                args);
    }

    @Override
    public void run(String... args) {

        // insert

        Spring_student s1 = new Spring_student();

        s1.setId(3);
        s1.setName("karthik");
        s1.setMarks(90);

        dao.saveStudent(s1);

        // fetching

        List<Spring_student> st =
                dao.getStudents();

        for(Spring_student s : st) {

            System.out.println(s);
        }
    }
}