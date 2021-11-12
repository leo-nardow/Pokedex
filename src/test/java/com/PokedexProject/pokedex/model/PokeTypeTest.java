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
public class PokeTypeTest {
	
	public PokeType pokeType;
	public PokeType pokeTypeNull = new PokeType();
	
	@Autowired
	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	Validator validator = factory.getValidator();
	
	@BeforeEach
	void start() {
		pokeType = new PokeType(0L, "Grass");
	}
	
	@Test
	void testValidateAttributes() {
		Set<ConstraintViolation<PokeType>> violation = validator.validate(pokeType);
		
		System.out.println(violation.toString());
		
		assertTrue(violation.isEmpty());
	}
	
	void testNotValidateAttributes() {
		Set<ConstraintViolation<PokeType>> violation = validator.validate(pokeTypeNull);
		
		System.out.println(violation.toString());
		
		assertFalse(violation.isEmpty());
	}
}
