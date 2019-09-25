package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.productRepository;


@Component
public class FindAllTestRunner implements CommandLineRunner{

	@Autowired
    private productRepository repo;	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		repo.save(new Product(10,"AA",12.2,"done"));
     
		System.out.println("****************************");
		repo.findAll().forEach(System.out::println);
		System.out.println("****************************");
		
		System.exit(0);
	}
	
	

}
