package com.avance.avancetb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Configuracion_aplicacion")
public class Configuracion_aplicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_CONFIG_ACCES;

    @Column(name = "Tamano_texto", nullable = false, length = 250)
    private int Tamano_texto;

    @Column(name = "lectura_automatica", nullable = false)
    private boolean lectura_automatica;

    @Column(name = "contraste", nullable = false,  length = 250)
    private int contraste;

    @Column(name = "modo_oscuro", nullable = false)
    private boolean modo_oscuro;

    @Column(name = "canal_de_noti_pref", nullable = false,  length = 250)
    private String canal_de_noti_pref;


    @ManyToOne
    @JoinColumn (name = "Id_Usuario")
    private Usuario usuario;


    public Configuracion_aplicacion(int ID_CONFIG_ACCES, int tamano_texto, boolean lectura_automatica, int contraste, boolean modo_oscuro, String canal_de_noti_pref, Usuario usuario) {
        this.ID_CONFIG_ACCES = ID_CONFIG_ACCES;
        Tamano_texto = tamano_texto;
        this.lectura_automatica = lectura_automatica;
        this.contraste = contraste;
        this.modo_oscuro = modo_oscuro;
        this.canal_de_noti_pref = canal_de_noti_pref;
        this.usuario = usuario;
    }

    public Configuracion_aplicacion() {

    }

    public int getID_CONFIG_ACCES() {
        return ID_CONFIG_ACCES;
    }

    public void setID_CONFIG_ACCES(int ID_CONFIG_ACCES) {
        this.ID_CONFIG_ACCES = ID_CONFIG_ACCES;
    }

    public int getTamano_texto() {
        return Tamano_texto;
    }

    public void setTamano_texto(int tamano_texto) {
        Tamano_texto = tamano_texto;
    }

    public boolean isLectura_automatica() {
        return lectura_automatica;
    }

    public void setLectura_automatica(boolean lectura_automatica) {
        this.lectura_automatica = lectura_automatica;
    }

    public int getContraste() {
        return contraste;
    }

    public void setContraste(int contraste) {
        this.contraste = contraste;
    }

    public boolean isModo_oscuro() {
        return modo_oscuro;
    }

    public void setModo_oscuro(boolean modo_oscuro) {
        this.modo_oscuro = modo_oscuro;
    }

    public String getCanal_de_noti_pref() {
        return canal_de_noti_pref;
    }

    public void setCanal_de_noti_pref(String canal_de_noti_pref) {
        this.canal_de_noti_pref = canal_de_noti_pref;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
