package com.gopi.HibernateProject1;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.gopi.HibernateProject1.entity.Course;
import com.gopi.HibernateProject1.entity.Student;
import com.gopi.HibernateProject1.repository.CourseRepository;

public class App3 {
	public static void main(String[] args) {
		Student s1 = new Student("Gopi", Date.valueOf(LocalDate.of(2002, 10, 12)));
		Student s2 = new Student("Thimma", Date.valueOf(LocalDate.of(2000, 8, 22)));
		Student s3 = new Student("Sai", Date.valueOf(LocalDate.of(2001, 1, 14)));
		Student s4 = new Student("Kumuda", Date.valueOf(LocalDate.of(2002, 2, 24)));
		
		List<Student> students=new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		Course c1 = new Course("Java", 120);
		Course c2 = new Course("J2EE", 90);
		Course c3 = new Course("Hibernate", 25);
		
		c1.setStudents(students);
		c2.setStudents(students);
		c3.setStudents(students);
		
		List<Course> courses= new ArrayList<>();
		
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		s1.setCourse(courses);
		s2.setCourse(courses);
		s3.setCourse(courses);
		s4.setCourse(courses);
		
		CourseRepository repository = new CourseRepository();
		repository.saveAllCourse(courses);
		
	}
}
