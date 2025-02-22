package com.example.demo.student;
import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor//generates a default constructor
@AllArgsConstructor//generates a constructor with all fields
public class Student {
public Student(long l, String string, String string2, LocalDate of, int i) {
		// TODO Auto-generated constructor stub
	}
private Long id;
private String name;
private String email;
private LocalDate dob;
private Integer age;
}
//public Student() {
//	super();
//}

//public Student(Long id,
//		String name, 
//		String email,
//		LocalDate dob, 
//		Integer age) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.email = email;
//	Dob = dob;
//	this.age = age;
//}
//
//public Student(String name,
//		String email, 
//		LocalDate dob, 
//		Integer age) {
//	super();
//	this.name = name;
//	this.email = email;
//	Dob = dob;
//	this.age = age;
//}
//
//
//public Long getId() {
//	return id;
//}
//
//public void setId(Long id) {
//	this.id = id;
//}
//
//public String getName() {
//	return name;
//}
//
//public void setName(String name) {
//	this.name = name;
//}
//
//public String getEmail() {
//	return email;
//}
//
//public void setEmail(String email) {
//	this.email = email;
//}
//
//public LocalDate getDob() {
//	return Dob;
//}
//
//public void setDob(LocalDate dob) {
//	Dob = dob;
//}
//
//public Integer getAge() {
//	return age;
//}
//
//public void setAge(Integer age) {
//	this.age = age;
//}
//
//@Override
//public String toString() {
//	return "Student [id=" + id + ","
//			+ " name=" + name + 
//			", email=" + email + 
//			", Dob=" + Dob + 
//			", age=" + age + "]";
//}
//
//
//}
