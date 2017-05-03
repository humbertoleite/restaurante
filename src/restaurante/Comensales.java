/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hlman
 */
public class Comensales {
    private String nombre;
    private int cantidad;
    private Date reserva;
    private Camarero camarero;
    private List<Carta> cartaLista = new ArrayList<Carta>();
    List<Comensales> comensalesLista = new ArrayList<Comensales>();
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
    
    public List<Comensales> anadir (List<Camarero> camarero){
        Scanner scanner = new Scanner(System.in);
        boolean entrada = true;

        while (entrada){
            System.out.println("¿ Cual es el nombre?");
            Comensales comensales = new Comensales();
            comensales.setNombre(scanner.nextLine());

            System.out.println("¿ Reserva para cuantas personas ?");
            comensales.setCantidad(scanner.nextInt());
            scanner.nextLine();

            System.out.println("¿ Reserva para cual día ?");
            comensales.setReserva(UtilRestaurante.FormatoFecha(scanner.nextLine()));

            System.out.println("¿ Cual es su camarero ?");        
            comensales.setCamarero(camarero.get(scanner.nextInt()));
            scanner.nextLine();

            comensalesLista.add(comensales);
            System.out.println("¿ Desea salir ?");    
            if (scanner.nextLine().toLowerCase().equals("salir")){
                entrada = false;

            }

        }
     return comensalesLista;
        
    }
    
    
    public void imprimir(){
        for(Comensales comensales: comensalesLista){
            System.out.println(comensales.getNombre()+"("+comensales.getCantidad()+")"+comensales.getReserva());
        }
    }
    
    public void anadirComida(Carta carta){
        cartaLista.add(carta);
    }
    
    public void imprimirCuenta(){
        
        for(Carta carta: cartaLista){
            System.out.println(carta.getNombre()+ " "+carta.getPrecio());
        }
    }
    
}
