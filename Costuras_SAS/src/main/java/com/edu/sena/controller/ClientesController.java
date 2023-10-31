package com.edu.sena.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sena.models.entity.Clientes;
import com.edu.sena.models.service.ClientesServies;

@RestController
@RequestMapping("/api/cliente")

public class ClientesController {
	@Autowired
	ClientesServies clienteService;
	
	@GetMapping("/{id}")
	public Optional<Clientes> buscarPorId(@PathVariable int id) {
		
		return clienteService.findById(id);		
	}
	
	@GetMapping("/listar")
	public List<Clientes> listarTodos(){
		
		return clienteService.findAll();
	}
	
	@PostMapping
	public Clientes guardar(@RequestBody Clientes c) {
		
		return clienteService.save(c);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable int id) {
		
		clienteService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Clientes actualizar(@RequestBody Clientes c, @PathVariable int id) {
		
		Clientes cEnBD = clienteService.findById(id).get();
		
		cEnBD.setCodigo(c.getCodigo());
		cEnBD.setNombre(c.getNombre());
		cEnBD.setCel(c.getCel());
		cEnBD.setDire(c.getDire());
		cEnBD.setIden(c.getIden());
		
		return clienteService.save(cEnBD);
	}
}