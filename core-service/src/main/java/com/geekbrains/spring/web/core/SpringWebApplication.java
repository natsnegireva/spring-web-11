package com.geekbrains.spring.web.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebApplication {
	// Домашнее задание:
	// 1. Покрыла код кор-сервиса доками сваггера
	// 3. В конфиге преобразование в:
	// integrations:
	//  cart-service:
	//    url: http://localhost:5555/cart
	//    timeouts:
	//      read: 2000
	//		write: 2000
	//		connection: 1000

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}
}
