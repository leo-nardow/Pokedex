package com.PokedexProject.pokedex.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PokemonTest {

	public Pokemon pokemon;
	public Pokemon pokemonNulo = new Pokemon();
	
	@Autowired
	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	
	Validator validator = factory.getValidator();
	
	@BeforeEach
	public void start() {
		pokemon = new Pokemon(0L, "Bulbasaur", "Grass", 12, 15, 1, 2, 0, "There is a plant seed on its back right from the day this Pokémon is born.");
	}
	
	@Test
	void testValidaAtributos() {
		Set<ConstraintViolation<Pokemon>> violacao = validator.validate(pokemon);
		
		System.out.println(violacao.toString());
		
		assertTrue(violacao.isEmpty());
	}
	
	@Test
	void testNaoValidaAtributos() {
		Set<ConstraintViolation<Pokemon>> violacao = validator.validate(pokemonNulo);
		
		System.out.println(violacao.toString());
		
		assertFalse(violacao.isEmpty());
	}
	
}
