package com.avance.avancetb.dtos;

import java.time.LocalDate;

public class UsuarioRegistroDTO {
    private int idUsuario;
    private String tokenUnico;
    private String username;
    private String dni;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Boolean autorizacionFamiliar;
    private LocalDate fechaNacimiento;
    private String contrasena;
    private String estadoCuenta;
    private Boolean tutorialCompletado;
    private LocalDate fechaPrimerAcceso;
    private String fotoPerfil;
    private int idRol;

    public UsuarioRegistroDTO() {
    }

    public UsuarioRegistroDTO(int idUsuario, String tokenUnico, String username, String dni, String apellidoPaterno, String apellidoMaterno, Boolean autorizacionFamiliar, LocalDate fechaNacimiento, String contrasena, String estadoCuenta, Boolean tutorialCompletado, LocalDate fechaPrimerAcceso, String fotoPerfil, int idRol) {
        this.idUsuario = idUsuario;
        this.tokenUnico = tokenUnico;
        this.username = username;
        this.dni = dni;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.autorizacionFamiliar = autorizacionFamiliar;
        this.fechaNacimiento = fechaNacimiento;
        this.contrasena = contrasena;
        this.estadoCuenta = estadoCuenta;
        this.tutorialCompletado = tutorialCompletado;
        this.fechaPrimerAcceso = fechaPrimerAcceso;
        this.fotoPerfil = fotoPerfil;
        this.idRol = idRol;
    }

    public LocalDate getFechaPrimerAcceso() {
        return fechaPrimerAcceso;
    }

    public void setFechaPrimerAcceso(LocalDate fechaPrimerAcceso) {
        this.fechaPrimerAcceso = fechaPrimerAcceso;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTokenUnico() {
        return tokenUnico;
    }

    public void setTokenUnico(String tokenUnico) {
        this.tokenUnico = tokenUnico;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Boolean getAutorizacionFamiliar() {
        return autorizacionFamiliar;
    }

    public void setAutorizacionFamiliar(Boolean autorizacionFamiliar) {
        this.autorizacionFamiliar = autorizacionFamiliar;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public Boolean getTutorialCompletado() {
        return tutorialCompletado;
    }

    public void setTutorialCompletado(Boolean tutorialCompletado) {
        this.tutorialCompletado = tutorialCompletado;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
}