package com.avance.avancetb.entities;

import com.avance.avancetb.entities.Usuario;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "NotificacionController")
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotificacion;

    @Column(name = "tituloNotificacion", length = 100, nullable = false)
    private String tituloNotificacion;

    @Column(name = "mensajeNotificacion", length = 300, nullable = false)
    private String mensajeNotificacion;

    @Column(name = "fechaNotificacion", nullable = false)
    private LocalDate fechaNotificacion;

    @Column(name = "leida", nullable = false)
    private boolean leida;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    public Notificacion() {
    }

    public Notificacion(int idNotificacion, String tituloNotificacion, String mensajeNotificacion, LocalDate fechaNotificacion, boolean leida, Usuario usuario) {
        this.idNotificacion = idNotificacion;
        this.tituloNotificacion = tituloNotificacion;
        this.mensajeNotificacion = mensajeNotificacion;
        this.fechaNotificacion = fechaNotificacion;
        this.leida = leida;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isLeida() {
        return leida;
    }

    public void setLeida(boolean leida) {
        this.leida = leida;
    }

    public LocalDate getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(LocalDate fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public String getMensajeNotificacion() {
        return mensajeNotificacion;
    }

    public void setMensajeNotificacion(String mensajeNotificacion) {
        this.mensajeNotificacion = mensajeNotificacion;
    }

    public String getTituloNotificacion() {
        return tituloNotificacion;
    }

    public void setTituloNotificacion(String tituloNotificacion) {
        this.tituloNotificacion = tituloNotificacion;
    }

    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }
}