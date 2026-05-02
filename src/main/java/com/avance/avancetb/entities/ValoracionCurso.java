package com.avance.avancetb.entities;

import com.avance.avancetb.entities.Cursos;
import com.avance.avancetb.entities.Usuario;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ValoracionCurso")
public class ValoracionCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idValoracionCurso;

    @Column(name = "calificacion", nullable = false)
    private int calificacion;

    @Column(name = "comentario", length = 300, nullable = true)
    private String comentario;

    @Column(name = "fechaValoracion", nullable = false)
    private LocalDate fechaValoracion;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idCurso", nullable = false)
    private Cursos curso;

    public ValoracionCurso() {
    }

    public ValoracionCurso(int idValoracionCurso, int calificacion, String comentario, LocalDate fechaValoracion, Usuario usuario, Cursos curso) {
        this.idValoracionCurso = idValoracionCurso;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fechaValoracion = fechaValoracion;
        this.usuario = usuario;
        this.curso = curso;
    }

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