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
public class Comensales {
    private String nombre;
    private int cantidad;
    private Date reserva;
    private Camarero camarero;

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
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the reserva
     */
    public Date getReserva() {
        return reserva;
    }

    /**
     * @param reserva the reserva to set
     */
    public void setReserva(Date reserva) {
        this.reserva = reserva;
    }

    /**
     * @return the camarero
     */
    public Camarero getCamarero() {
        return camarero;
    }

    /**
     * @param camarero the camarero to set
     */
    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }
}
