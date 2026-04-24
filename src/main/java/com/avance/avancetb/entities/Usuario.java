package com.avance.avancetb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Usuario") 
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "nombreUsuario",length = 150,nullable = false)
    private String nombreUsuario;

    @Column(name = "nombrePaterno",length = 150,nullable = false)
    private String nombrePaterno;

    @Column(name = "nombreMaterno",length = 150,nullable = false)
    private String nombreMaterno;

    @Column(name = "registroAsistido",nullable = false)
    private boolean registroAsistido;

    @Column(name = "autorizacionFamiliar",length = 150,nullable = false)
    private String autorizacionFamiliar;

    @Column(name = "lecturaAutomatica",nullable = false)
    private boolean lecturaAutomatica;

    @Column(name = "fechaNacimiento",nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "username",length = 150,nullable = false)
    private String username;

    @Column(name = "contrasena",length = 150,nullable = false)
    private String contrasena;

    @Column(name = "dni",nullable = false)
    private int dni;

    @Column(name = "estadoCuenta",length = 150,nullable = false)
    private String estadoCuenta;

    @Column(name = "fechaPrimerAcceso",nullable = false)
    private LocalDate fechaPrimerAcceso;

    @Column(name = "tutorialCompletado",nullable = false)
    private boolean tutorialCompletado;

   public Usuario() {}

    public Usuario(int idUsuario, String nombreUsuario, String nombrePaterno, String nombreMaterno, boolean registroAsistido, String autorizacionFamiliar, boolean lecturaAutomatica, LocalDate fechaNacimiento, String username, String contrasena, int dni, String estadoCuenta, LocalDate fechaPrimerAcceso, boolean tutorialCompletado) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.nombrePaterno = nombrePaterno;
        this.nombreMaterno = nombreMaterno;
        this.registroAsistido = registroAsistido;
        this.autorizacionFamiliar = autorizacionFamiliar;
        this.lecturaAutomatica = lecturaAutomatica;
        this.fechaNacimiento = fechaNacimiento;
        this.username = username;
        this.contrasena = contrasena;
        this.dni = dni;
        this.estadoCuenta = estadoCuenta;
        this.fechaPrimerAcceso = fechaPrimerAcceso;
        this.tutorialCompletado = tutorialCompletado;
    }

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


