package com.vendas.secao3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vendas.secao3.model.Customers;
import com.vendas.secao3.repositories.CustomerRepository;

@SpringBootApplication
public class Secao3Application {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(Secao3Application.class, args);
	}

	@Bean
	public CommandLineRunner createCustomer() {
		return args -> {
			var newCustomer = new Customers();
			newCustomer.setName("Diego Ramos");
			customerRepository.save(newCustomer);

			var customers = customerRepository.findAll();

			for (var customer : customers) {
				System.out.println("Customer id: " + customer.getId());
				System.out.println("Customer name: " + customer.getName());
			}
		};
	}
}
