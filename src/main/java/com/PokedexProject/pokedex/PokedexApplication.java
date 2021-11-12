package com.PokedexProject.pokedex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokedexApplication {

	public String greeting()
	{
		return ("<h1 \"style=text-align: center;\">Gurdurr working around here!</h1>");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);
	}

}
