package com.icici.devops_demo_icici;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopsDemoIciciApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoIciciApplication.class, args);
	}

    @GetMapping("/")
    public String hello() {
      return String.format("<h1> Hello There!!!, welcome to my project</h1>");
    }
}
