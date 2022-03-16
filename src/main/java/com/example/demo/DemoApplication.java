package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	private final List<String> resources;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public DemoApplication(@Autowired List<String> resources) {
		this.resources = resources;
	}

	@GetMapping(value = "/resource/{id}")
	public String getResource(@PathVariable @NonNull Integer id) {
		if(id <= 0) throw new IllegalArgumentException();
		String response =  "Resource #" + id;
		this.resources.add(response);
		return response;
	}

	@GetMapping(value = "/resources")
	public List<String> getResources() {
		return resources;
	}
}
