package com.example.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/payment")

@SpringBootApplication
public class PaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
		System.out.println("Inside Payment for jenkin checking   ");
	}

@GetMapping("/{id}")
public User getMethodName(@PathVariable int id) {
	System.out.println("Inside Payment  API called ");
    return new User("Mahveer", id);
}


}
