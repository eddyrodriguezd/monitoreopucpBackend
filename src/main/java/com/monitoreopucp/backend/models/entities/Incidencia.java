package com.monitoreopucp.backend.models.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.monitoreopucp.backend.models.entities.Anotacion;

public class Incidencia implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
    private int idUsuario;
    private int idFoto;
    private String titulo;
    private String descripcion;
    private double latitud;
    private double longitud;
    private List<Anotacion> anotaciones;
    private Date fechaRegistro;
    private Date fechaRevision;
    private String estado;

    public Incidencia() {
    }

    public Incidencia(int id, int idUsuario, int idFoto, String titulo, String descripcion,
                      double latitud, double longitud, List<Anotacion> anotaciones, Date fechaRegistro,
                      Date fechaRevision, String estado) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idFoto = idFoto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.anotaciones = anotaciones;
        this.fechaRegistro = fechaRegistro;
        this.fechaRevision = fechaRevision;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public List<Anotacion> getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(List<Anotacion> anotaciones) {
        this.anotaciones = anotaciones;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(Date fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
