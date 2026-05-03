package com.avance.avancetb.dtos;

import jakarta.persistence.Column;

import java.time.LocalTime;

public class Valoracion_cursoDTO {

    private int ID_Valoracion;


    private String comentario;


    private int calificacion;


    private LocalTime Fecha_valoracion;


    public int getID_Valoracion() {
        return ID_Valoracion;
    }

    public void setID_Valoracion(int ID_Valoracion) {
        this.ID_Valoracion = ID_Valoracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public LocalTime getFecha_valoracion() {
        return Fecha_valoracion;
    }

    public void setFecha_valoracion(LocalTime fecha_valoracion) {
        Fecha_valoracion = fecha_valoracion;
    }
}
