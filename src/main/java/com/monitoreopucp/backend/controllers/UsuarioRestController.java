package com.monitoreopucp.backend.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/crear")
	public void find(@Valid @RequestBody Usuario usuario) {
		usuarioService.save(usuario);
	}
	
	@PutMapping("/actualizar")
	public void update(@Valid @RequestBody Usuario usuario, @RequestParam Integer id) {
		Usuario usuarioActual = usuarioService.findById(id);
		usuarioActual.setNombre(usuario.getNombre());
		usuarioActual.setApellido(usuario.getApellido());
		usuarioActual.setCorreo(usuario.getCorreo());
		usuarioActual.setCodigo(usuario.getCodigo());
		
		usuarioService.save(usuarioActual);
	}
	
	@DeleteMapping("/eliminar")
	public void delete(@RequestParam Integer id) {
		Usuario usuarioActual = usuarioService.findById(id);
		usuarioService.delete(usuarioActual);
	}


}
