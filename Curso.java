package com.avance.avancetb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Cursos")
    private Integer idCursos;

    @Column(name = "Tipo_Curso")
    private String tipoCurso;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Nombre_Curso")
    private String nombreCurso;

    @Column(name = "Objetivos")
    private String objetivos;

    public Curso(Integer idCursos, String tipoCurso, String descripcion, String nombreCurso, String objetivos) {
        this.idCursos = idCursos;
        this.tipoCurso = tipoCurso;
        this.descripcion = descripcion;
        this.nombreCurso = nombreCurso;
        this.objetivos = objetivos;
    }

    public Curso() {
    }

    public Integer getIdCursos() {
        return idCursos;
    }

    public void setIdCursos(Integer idCursos) {
        this.idCursos = idCursos;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }
}