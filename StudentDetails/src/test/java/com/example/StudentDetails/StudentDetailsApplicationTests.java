package com.example.StudentDetails;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.StudentDetails.entity.Student;

@SpringBootTest
class StudentDetailsApplicationTests {
	@Test
	void testStudentDetails() {
	        Student student = new Student();
	        student.setName("Jaya");
	        student.setAge(22);
	        student.setSalary(28400.0);
	 
	        assertEquals("Jaya", student.getName());
	        assertEquals(22, student.getAge());
	        assertEquals(28000.0, student.getSalary(), 0.001);
	    }
	}

