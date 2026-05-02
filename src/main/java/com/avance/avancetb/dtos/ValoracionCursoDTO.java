package com.avance.avancetb.dtos;

import com.avance.avancetb.entities.Cursos;
import com.avance.avancetb.entities.Usuario;
import jakarta.persistence.*;

import java.time.LocalDate;

public class ValoracionCursoDTO {

    private int idValoracionCurso;

    private int calificacion;


    private String comentario;


    private LocalDate fechaValoracion;

    private Usuario usuario;

    private Cursos curso;

    public int getIdValoracionCurso() {
        return idValoracionCurso;
    }

    public void setIdValoracionCurso(int idValoracionCurso) {
        this.idValoracionCurso = idValoracionCurso;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFechaValoracion() {
        return fechaValoracion;
    }

    public void setFechaValoracion(LocalDate fechaValoracion) {
        this.fechaValoracion = fechaValoracion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }
}
