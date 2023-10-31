package com.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cargo")
public class Cargo {
	@Id
	@Column(name="Idcargo",nullable=false)
	private int codigo;
	
	@Column(name="NomCargo", nullable=false)
	private String Nombre;

	public Cargo() {
		super();
	}

	public Cargo(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		Nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}