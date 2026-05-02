package com.avance.avancetb.dtos;

import com.avance.avancetb.entities.Cursos;
import jakarta.persistence.*;

public class SesionDTO {

    private int idSesion;

    private String tituloSesion;

    private String descripcionSesion;

    private int ordenSesion;

    private Cursos curso;

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public String getTituloSesion() {
        return tituloSesion;
    }

    public void setTituloSesion(String tituloSesion) {
        this.tituloSesion = tituloSesion;
    }

    public String getDescripcionSesion() {
        return descripcionSesion;
    }

    public void setDescripcionSesion(String descripcionSesion) {
        this.descripcionSesion = descripcionSesion;
    }

    public int getOrdenSesion() {
        return ordenSesion;
    }

    public void setOrdenSesion(int ordenSesion) {
        this.ordenSesion = ordenSesion;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }
}
