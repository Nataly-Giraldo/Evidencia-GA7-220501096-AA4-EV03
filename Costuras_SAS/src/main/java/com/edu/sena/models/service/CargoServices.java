package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.Cargo;

public interface CargoServices {
	public Optional<Cargo>findById(Integer id);
	public List<Cargo> findAll();
	public Cargo save(Cargo cr);
	public void deleteById(int id);
}
