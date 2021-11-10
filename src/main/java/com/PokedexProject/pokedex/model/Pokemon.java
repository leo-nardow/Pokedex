package com.PokedexProject.pokedex.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_pokemons")
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@NotNull(message = "O nome é Obrigatorio!")
	private String nome;
	
	@NotNull(message = "O tipo é Obrigatorio!")
	private String tipo;
	
	@NotNull(message = "A altura é Obrigatorio!")
	private float altura;
	
	@NotNull(message = "O peso é Obrigatorio!")
	private float peso;

	
	
	public Pokemon(long id, String nome,String tipo, float altura, float peso) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.altura = altura;
		this.peso = peso;
	}
	
	public Pokemon() { }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
}
