package com.avance.avancetb.dtos;

public class Configuracion_aplicacionDTO {

    private int Tamano_texto;

    private boolean lectura_automatica;

    private int contraste;

    private boolean modo_oscuro;

    private String canal_de_noti_pref;


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
}
