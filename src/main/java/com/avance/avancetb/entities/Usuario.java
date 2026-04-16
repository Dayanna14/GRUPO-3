package com.avance.avancetb.entities;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "Usuario") // opcional pero recomendado
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Usuario;

    @Column(name = "Nombre_Usuario",length = 150,nullable = false)
    private String Nombre_Usuario;

    @Column(name = "Nombre_paterno",length = 150,nullable = false)
    private String Nombre_paterno;

    @Column(name = "Nombre_materno",length = 150,nullable = false)
    private String Nombre_materno;

    @Column(name = "registro_asistido",nullable = false)
    private boolean registro_asistido;

    @Column(name = "autorizacion_familiar",length = 150,nullable = false)
    private String autorizacion_familiar;

    @Column(name = "lectura_automatica",nullable = false)
    private boolean lectura_automatica;

    @Column(name = "Fecha_nacimiento",nullable = false)
    private LocalTime Fecha_nacimiento;

    @Column(name = "username",length = 150,nullable = false)
    private String username;

    @Column(name = "contraseña",length = 150,nullable = false)
    private String contraseña;

    @Column(name = "DNI",nullable = false)
    private int DNI;

    @Column(name = "estado_cuenta",length = 150,nullable = false)
    private String estado_cuenta;

    @Column(name = "fecha_primer_acceso",nullable = false)
    private LocalTime fecha_primer_acceso;

    @Column(name = "tutorial_completado",nullable = false)
    private boolean tutorial_completado;

    public Usuario(int id_Usuario, String nombre_Usuario, String nombre_paterno, String nombre_materno, boolean registro_asistido, String autorizacion_familiar, boolean lectura_automatica, LocalTime fecha_nacimiento, String username, String contraseña, int DNI, String estado_cuenta, LocalTime fecha_primer_acceso, boolean tutorial_completado) {
        Id_Usuario = id_Usuario;
        Nombre_Usuario = nombre_Usuario;
        Nombre_paterno = nombre_paterno;
        Nombre_materno = nombre_materno;
        this.registro_asistido = registro_asistido;
        this.autorizacion_familiar = autorizacion_familiar;
        this.lectura_automatica = lectura_automatica;
        Fecha_nacimiento = fecha_nacimiento;
        this.username = username;
        this.contraseña = contraseña;
        this.DNI = DNI;
        this.estado_cuenta = estado_cuenta;
        this.fecha_primer_acceso = fecha_primer_acceso;
        this.tutorial_completado = tutorial_completado;
    }

    public Usuario() {

    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        Id_Usuario = id_Usuario;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        Nombre_Usuario = nombre_Usuario;
    }

    public String getNombre_paterno() {
        return Nombre_paterno;
    }

    public void setNombre_paterno(String nombre_paterno) {
        Nombre_paterno = nombre_paterno;
    }

    public String getNombre_materno() {
        return Nombre_materno;
    }

    public void setNombre_materno(String nombre_materno) {
        Nombre_materno = nombre_materno;
    }

    public boolean isRegistro_asistido() {
        return registro_asistido;
    }

    public void setRegistro_asistido(boolean registro_asistido) {
        this.registro_asistido = registro_asistido;
    }

    public String getAutorizacion_familiar() {
        return autorizacion_familiar;
    }

    public void setAutorizacion_familiar(String autorizacion_familiar) {
        this.autorizacion_familiar = autorizacion_familiar;
    }

    public boolean isLectura_automatica() {
        return lectura_automatica;
    }

    public void setLectura_automatica(boolean lectura_automatica) {
        this.lectura_automatica = lectura_automatica;
    }

    public LocalTime getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalTime fecha_nacimiento) {
        Fecha_nacimiento = fecha_nacimiento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getEstado_cuenta() {
        return estado_cuenta;
    }

    public void setEstado_cuenta(String estado_cuenta) {
        this.estado_cuenta = estado_cuenta;
    }

    public LocalTime getFecha_primer_acceso() {
        return fecha_primer_acceso;
    }

    public void setFecha_primer_acceso(LocalTime fecha_primer_acceso) {
        this.fecha_primer_acceso = fecha_primer_acceso;
    }

    public boolean isTutorial_completado() {
        return tutorial_completado;
    }

    public void setTutorial_completado(boolean tutorial_completado) {
        this.tutorial_completado = tutorial_completado;
    }
}


