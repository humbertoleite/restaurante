/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.Date;

/**
 *
 * @author hlman
 */
public class Empleados {
  private String nombre;
  private RangoEnum rango;  
  private Date fechaInicio;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the rango
     */
    public RangoEnum getRango() {
        return rango;
    }

    /**
     * @param rango the rango to set
     */
    public void setRango(RangoEnum rango) {
        this.rango = rango;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
