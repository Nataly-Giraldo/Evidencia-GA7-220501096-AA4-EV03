package com.edu.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.sena.models.entity.Usuario;

//hereda de JpaRepository para tener acceso a sus metodos
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
	//Se declara un metodo para traer el usuario
	Usuario findByUsername(String user);
}