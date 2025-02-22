package com.example.demo;
import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

import lombok.Data;
@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name) ;
	}
	
	//Get /greet?name = Alex
	@GetMapping("/greet")
	public String greet(@RequestParam String name) {
		return "Hello!, " + name + "!";
	}
	
	
	@GetMapping("/hello1")
	public List<Student>hello1(){
		return List.of(
				List.of(new Student(1L, "Riya", "riya123@gmail.com", LocalDate.of(2000, 1, 25), 24));

		
	}
	@PostMapping("/user")
	public String createUser(@RequestBody User user) {
		return "User "+ user.getName()  + " created!";
	}
	@Data
	static class User{
		private String name;

		
	}

}
