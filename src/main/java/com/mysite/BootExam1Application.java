package com.mysite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication 어노테이션에 여러가지의 어노테이션이 포장되어 있다.
@SpringBootApplication
public class BootExam1Application {

	public static void main(String[] args) {
		// run() 메서드로 스프링 부트가 실행된다.
		SpringApplication.run(BootExam1Application.class, args);
	}

}
