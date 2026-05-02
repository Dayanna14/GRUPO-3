package com.avance.avancetb.entities;

import com.avance.avancetb.entities.Cursos;
import jakarta.persistence.*;

@Entity
@Table(name = "Sesion")
public class Sesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSesion;

    @Column(name = "tituloSesion", length = 100, nullable = false)
    private String tituloSesion;

    @Column(name = "descripcionSesion", length = 300, nullable = false)
    private String descripcionSesion;

    @Column(name = "ordenSesion", nullable = false)
    private int ordenSesion;

    @ManyToOne
    @JoinColumn(name = "idCurso", nullable = false)
    private Cursos curso;

    public Sesion() {
    }

    public Sesion(int idSesion, String tituloSesion, String descripcionSesion, int ordenSesion, Cursos curso) {
        this.idSesion = idSesion;
        this.tituloSesion = tituloSesion;
        this.descripcionSesion = descripcionSesion;
        this.ordenSesion = ordenSesion;
        this.curso = curso;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public int getOrdenSesion() {
        return ordenSesion;
    }

    public void setOrdenSesion(int ordenSesion) {
        this.ordenSesion = ordenSesion;
    }

    public String getDescripcionSesion() {
        return descripcionSesion;
    }

    public void setDescripcionSesion(String descripcionSesion) {
        this.descripcionSesion = descripcionSesion;
    }

    public String getTituloSesion() {
        return tituloSesion;
    }

    public void setTituloSesion(String tituloSesion) {
        this.tituloSesion = tituloSesion;
    }

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }
}