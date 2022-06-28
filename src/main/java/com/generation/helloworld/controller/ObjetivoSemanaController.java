package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivosemana")
public class ObjetivoSemanaController {

	
	@GetMapping
	public String objetivoSemana() {
		return "Objrtivo da semana:"
				+ "Apreender Spring"
				+ "Usar o Postman"
				+ "Fazer Hello World";
	}
}
