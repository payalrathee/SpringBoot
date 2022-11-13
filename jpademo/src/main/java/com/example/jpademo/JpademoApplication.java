package com.example.jpademo;

import java.util.List;
import java.util.Optional;

import org.hibernate.resource.transaction.spi.TransactionCoordinatorBuilder.Options;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.jpademo.beans.Student;
import com.example.jpademo.repository.StudentRepository;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(JpademoApplication.class, args);
		StudentRepository repo=ctx.getBean(StudentRepository.class);
		
		//insert---single
		//Student s=new Student(101,"aman",92);
		//repo.save(s);
		
		//insert---multiple
		//Student s1=new Student(102,"nisha",98);
		//Student s2=new Student(103,"daman",89);
		//List<Student> students=List.of(s1,s2);
		//repo.saveAll(students);
		
		//retrieve---single
		//Optional<Student> o=repo.findById(102);
		//Student s=o.get();
		//System.out.println(s);
		
		//retrieve---multiple
		//List<Student> students=repo.findAll();
		//students.forEach(s->System.out.println(s));
		
		//update
		//Student s=repo.findById(102).get();
		//s.setName("Brisha");
		//repo.save(s);
		
		//delete
		//Student s=repo.findById(102).get();
		//repo.delete(s);
		repo.deleteById(103);
		
	}

}
