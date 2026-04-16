package com.avance.avancetb.dtos;


import java.time.LocalDate;

public class UsuarioDTO {
    private int Id_Usuario;
    private String Nombre_Usuario;
    private String Nombre_paterno;
    private String Nombre_materno;
    private boolean registro_asistido;
    private String autorizacion_familiar;
    private boolean lectura_automatica;
    private LocalDate Fecha_nacimiento;
    private String username;
    private String contraseña;
    private int DNI;
    private String estado_cuenta;
    private LocalDate fecha_primer_acceso;
    private boolean tutorial_completado;

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

    public LocalDate getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
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

    public LocalDate getFecha_primer_acceso() {
        return fecha_primer_acceso;
    }

    public void setFecha_primer_acceso(LocalDate fecha_primer_acceso) {
        this.fecha_primer_acceso = fecha_primer_acceso;
    }

    public boolean isTutorial_completado() {
        return tutorial_completado;
    }

    public void setTutorial_completado(boolean tutorial_completado) {
        this.tutorial_completado = tutorial_completado;
    }
}
