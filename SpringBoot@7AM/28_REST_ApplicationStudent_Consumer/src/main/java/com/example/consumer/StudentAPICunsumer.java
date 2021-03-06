package com.example.consumer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.model.Student;

@Component
public class StudentAPICunsumer implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Welcome");
		/*
		 * String url = "http://localhost:9098/emp/3";
		 * 
		 * RestTemplate rest = new RestTemplate();
		 * ResponseEntity<Student> studentRes = rest.getForEntity(url, Student.class);
		 * 
		 * System.out.println(studentRes.getStatusCode());
		 * System.out.println(studentRes.getBody());
		 * System.out.println(studentRes.getStatusCodeValue());
		 */


		String url = "http://localhost:9098/emp/all";

		RestTemplate rest = new RestTemplate();
		ResponseEntity<Student[]> respStud = rest.getForEntity(url, Student[].class);

		Student[] arr =respStud.getBody();
		List<Student> list = Arrays.asList(arr);

		list.forEach(l->System.out.println(l));
		
		
		
		System.exit(0);
	}
}