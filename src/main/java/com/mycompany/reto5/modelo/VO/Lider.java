/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5.modelo.VO;

/**
 *
 * @author Fabian
 */
public class Lider {
    private int id_lider;
    private String nombre;
    private String primer_Apellido;
    private String Ciudad_Residencia;

    public Lider() {
    }

    public Lider(int id_lider, String nombre, String primer_Apellido, String Ciudad_Residencia) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.primer_Apellido = primer_Apellido;
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    public int getId_lider() {
        return id_lider;
    }

    public void setId_lider(int id_lider) {
        this.id_lider = id_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_Apellido() {
        return primer_Apellido;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        this.primer_Apellido = primer_Apellido;
    }

    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }

    public void setCiudad_Residencia(String Ciudad_Residencia) {
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    @Override
    public String toString() {
        return "Lider{" + "id_lider=" + id_lider + ", nombre=" + nombre + ", primer_Apellido=" + primer_Apellido + ", Ciudad_Residencia=" + Ciudad_Residencia + '}';
    }
    
    
    
}
