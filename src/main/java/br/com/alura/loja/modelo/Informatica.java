package br.com.alura.loja.modelo;

import javax.persistence.Entity;

@Entity
public class Informatica extends Produto {

	private String marca;
	private Integer modelo;

	public Informatica() {

	}

	public Informatica(String marca, Integer modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getmarca() {
		return marca;
	}

	public void setmarca(String marca) {
		this.marca = marca;
	}

	public Integer getmodelo() {
		return modelo;
	}

	public void setmodelo(Integer modelo) {
		this.modelo = modelo;
	}

}
