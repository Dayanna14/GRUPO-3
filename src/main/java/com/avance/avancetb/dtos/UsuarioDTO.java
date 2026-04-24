package com.avance.avancetb.dtos;


import java.time.LocalDate;

public class UsuarioDTO {
    private int idUsuario;
    private String nombreUsuario;
    private String nombrePaterno;
    private String nombreMaterno;
    private boolean registroAsistido;
    private String autorizacionFamiliar;
    private boolean lecturaAutomatica;
    private LocalDate fechaNacimiento;
    private String username;
    private String contrasena;
    private int dni;
    private String estadoCuenta;
    private LocalDate fechaPrimerAcceso;
    private boolean tutorialCompletado;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombrePaterno() {
        return nombrePaterno;
    }

    public void setNombrePaterno(String nombrePaterno) {
        this.nombrePaterno = nombrePaterno;
    }

    public String getNombreMaterno() {
        return nombreMaterno;
    }

    public void setNombreMaterno(String nombreMaterno) {
        this.nombreMaterno = nombreMaterno;
    }

    public boolean isRegistroAsistido() {
        return registroAsistido;
    }

    public void setRegistroAsistido(boolean registroAsistido) {
        this.registroAsistido = registroAsistido;
    }

    public String getAutorizacionFamiliar() {
        return autorizacionFamiliar;
    }

    public void setAutorizacionFamiliar(String autorizacionFamiliar) {
        this.autorizacionFamiliar = autorizacionFamiliar;
    }

    public boolean isLecturaAutomatica() {
        return lecturaAutomatica;
    }

    public void setLecturaAutomatica(boolean lecturaAutomatica) {
        this.lecturaAutomatica = lecturaAutomatica;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public LocalDate getFechaPrimerAcceso() {
        return fechaPrimerAcceso;
    }

    public void setFechaPrimerAcceso(LocalDate fechaPrimerAcceso) {
        this.fechaPrimerAcceso = fechaPrimerAcceso;
    }

    public boolean isTutorialCompletado() {
        return tutorialCompletado;
    }

    public void setTutorialCompletado(boolean tutorialCompletado) {
        this.tutorialCompletado = tutorialCompletado;
    }
}
