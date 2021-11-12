package com.PokedexProject.pokedex.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_pokemons")
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "The name is required!")
	private String name;
	
	@NotNull(message = "The type is required!")
	private String type;
	
	@NotNull(message = "The height is required!")
	private float height;
	
	@NotNull(message = "The weight is required!")
	private float weight;
	
	@NotNull(message = "The generation is required!")
	private int generation;
	
	private int evolution;
	
	private int devolution;
	
	private String description;

	public Pokemon(long id, String name, String type, float height, float weight, int generation, int evolution, int devolution, String description) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.height = height;
		this.weight = weight;
		this.generation = generation;
		this.evolution = evolution;
		this.devolution = devolution;
		this.description = description;
	}
	
	public Pokemon() { }

	
	public long getId() {
		return id;
	}

	

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getGeneration() {
		return generation;
	}

	public void setGeneration(int generation) {
		this.generation = generation;
	}

	public int getEvolution() {
		return evolution;
	}

	public void setEvolution(int evolution) {
		this.evolution = evolution;
	}

	public int getDevolution() {
		return devolution;
	}

	public void setDevolution(int devolution) {
		this.devolution = devolution;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	


	
	
	
}
