package com.helloworld.Objetivos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/objetivos")
public class ObjController {
	
	@GetMapping
	public String objetivos() {
		
		return 
				"Finalizar SQL / Iniciar Api pelo Spring Boot";
	}
	
	
	
	
	
}
