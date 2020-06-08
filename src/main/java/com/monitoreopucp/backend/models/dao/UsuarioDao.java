package com.monitoreopucp.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.monitoreopucp.backend.models.entities.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Integer>{

}
