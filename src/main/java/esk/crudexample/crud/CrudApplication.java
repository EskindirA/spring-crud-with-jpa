package esk.crudexample.crud;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import esk.crudexample.crud.esk.crudexample.crud.student.Student;

@SpringBootApplication
@RestController
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(1L, "John Doe", "john@test.com", LocalDate.of(2000, Month.JANUARY, 5), 21));
	}
}
