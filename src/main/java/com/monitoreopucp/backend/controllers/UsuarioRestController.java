package com.monitoreopucp.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monitoreopucp.backend.models.entities.Usuario;
import com.monitoreopucp.backend.models.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRestController {
	
	@Autowired
	private UsuarioService usuarioService; 
	
	@GetMapping("/listar")
	public List<Usuario> findAll() {
		return usuarioService.findAll();
	}
	
	@GetMapping("/buscar")
	public Usuario find(@RequestParam Integer id) {
		return usuarioService.findById(id);
	}

}
