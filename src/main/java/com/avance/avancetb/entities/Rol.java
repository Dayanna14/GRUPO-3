package com.avance.avancetb.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Rol")
public class Rol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id_rol;

    @Column(name = "nameRol",length = 50,nullable = false)
    private String nameRol;

    @Column(name = "descriptionRol",length = 100,nullable = false)
    private String descriptionRol;

    public Rol() {
    }

    public Rol(int idRol, String descriptionRol, String nameRol) {
        this.id_rol = id_rol;
        this.descriptionRol = descriptionRol;
        this.nameRol = nameRol;
    }

    public int getIdRol() {
        return id_rol;
    }

    public void setIdRol(int idRol) {
        this.id_rol = id_rol;
    }

    public String getNameRol() {
        return nameRol;
    }

    public void setNameRol(String nameRol) {
        this.nameRol = nameRol;
    }

    public String getDescriptionRol() {
        return descriptionRol;
    }

    public void setDescriptionRol(String descriptionRol) {
        this.descriptionRol = descriptionRol;
    }
}
