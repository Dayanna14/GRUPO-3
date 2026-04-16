package com.avance.avancetb.dtos;

public class CursoDTO {

    private Integer idCursos;
    private String tipoCurso;
    private String descripcion;
    private String nombreCurso;
    private String objetivos;

    public CursoDTO(Integer idCursos, String tipoCurso, String descripcion, String nombreCurso, String objetivos) {
        this.idCursos = idCursos;
        this.tipoCurso = tipoCurso;
        this.descripcion = descripcion;
        this.nombreCurso = nombreCurso;
        this.objetivos = objetivos;
    }

    public CursoDTO() {
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