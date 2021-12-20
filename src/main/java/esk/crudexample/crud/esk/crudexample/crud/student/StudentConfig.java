package esk.crudexample.crud.esk.crudexample.crud.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student bob = new Student("Bob", "bob@test.com", LocalDate.of(2000,
                    Month.JANUARY, 5));

            Student alice = new Student("Alice ", "alice@test.com", LocalDate.of(2005,
                    Month.JANUARY, 5));

            repository.saveAll(List.of(bob, alice));
        };
    }
}
