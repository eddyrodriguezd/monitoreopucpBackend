package com.monitoreopucp.backend.models.services;

import java.util.List;

import com.monitoreopucp.backend.models.entities.Usuario;

public interface UsuarioService {
	
	public List<Usuario> findAll();
	
	public void save(Usuario usuario);
	
	public Usuario findById(Integer id);
	
	public void delete(Usuario usuario);

}
