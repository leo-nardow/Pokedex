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
public class UserTest {
	
	public User user;
	public User userNull = new User();
	
	@Autowired
	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	
	Validator validator = factory.getValidator();
	
	@BeforeEach
	public void start() {
		user = new User(0L, "Leo", "leo@email.com", "123456");
	}
	
	@Test
	void testValidateAttributes() {
		Set<ConstraintViolation<User>> violation = validator.validate(user);
		
		System.out.println(violation.toString());
		
		assertTrue(violation.isEmpty());
	}
	
	@Test
	void testNotValidadeAttributes() {
		Set<ConstraintViolation<User>> violation = validator.validate(userNull);
		
		System.out.println(violation.toString());
		
		assertFalse(violation.isEmpty());
	}
	

}
