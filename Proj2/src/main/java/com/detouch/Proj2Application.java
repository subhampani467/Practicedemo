package com.detouch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.detouch")
public class Proj2Application{

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		
		WishmsgGeneratorService service=null;
		
		ctx=SpringApplication.run(Proj2Application.class, args);
		
		service=ctx.getBean("wish",WishmsgGeneratorService.class);
		
		System.out.println(service.generateWishMessage("SUBHAM"));
	}

}
