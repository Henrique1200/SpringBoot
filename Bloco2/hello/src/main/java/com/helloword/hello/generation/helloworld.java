package com.helloword.hello.generation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Hello")
@RestController
public class helloworld {
	public String[] bsms = {"Orientacao ao futuro", "Responsabilidade Pessoal", 
			"Mentalidade de Crescimento", "Persistencia",
			"Trabalho em equipe", "Orientacao ao detalhe", 
			"Pro-atividade", "Comunicacao"};
	
	@GetMapping("/Hello1")
	public String helloWorld() {
		return "Hello Generation Brasil!!!";
	}
	@GetMapping("/Hello2")
	public String[] bsms() {
		return bsms;
		}
	@GetMapping("/Hello3")
	public String objetivos() {
		return "Quero entender Springboot!";
	
	}

}