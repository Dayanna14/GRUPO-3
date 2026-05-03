package com.avance.avancetb.entities;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "Valoracion_curso")
public class Valoracion_curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Valoracion;

    @Column(name = "comentario", length = 250, nullable = false)
    private String comentario;

    @Column(name = "calificacion", nullable = false)
    private int calificacion;

    @Column(name = "Fecha_valoracion", nullable = false)
    private LocalTime Fecha_valoracion;


    public Valoracion_curso(int ID_Valoracion, String comentario, int calificacion, LocalTime fecha_valoracion) {
        this.ID_Valoracion = ID_Valoracion;
        this.comentario = comentario;
        this.calificacion = calificacion;
        Fecha_valoracion = fecha_valoracion;
    }


    //@ManyToOne
    //@JoinColumn(name = "", nullable = false)
    //private Usuario_curso;

    public Valoracion_curso() {

    }

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
