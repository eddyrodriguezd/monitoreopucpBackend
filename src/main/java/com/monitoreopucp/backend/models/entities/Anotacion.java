package com.monitoreopucp.backend.models.entities;

import java.io.Serializable;

public class Anotacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idUsuario;
    private String contenido;

    public Anotacion(){

    }

    public Anotacion(int idUsuario, String contenido) {
        this.idUsuario = idUsuario;
        this.contenido = contenido;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

}
