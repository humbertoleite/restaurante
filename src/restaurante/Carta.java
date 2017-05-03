/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hlman
 */
public class Carta {
   private String nombre;
   private double precio;
   private int tiempoSalida;
   private List<Carta> listaCarta = new ArrayList<Carta>();
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
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the tiempoSalida
     */
    public int getTiempoSalida() {
        return tiempoSalida;
    }

    /**
     * @param tiempoSalida the tiempoSalida to set
     */
    public void setTiempoSalida(int tiempoSalida) {
        this.tiempoSalida = tiempoSalida;
    }
    
    public List <Carta> anadir(){
     Scanner scanner = new Scanner(System.in);
     boolean entrada = true;
     
     while (entrada){
         Carta cartaPlato = new Carta();
         System.out.println("Nombre del plato");
         cartaPlato.nombre = scanner.nextLine();
         
         System.out.println("Inserta precio");
         cartaPlato.precio = scanner.nextDouble();
         scanner.nextLine();
     
         System.out.println("Tiempo de salida");
         cartaPlato.tiempoSalida = scanner.nextInt();
         scanner.nextLine();
         
         this.getListaCarta().add(cartaPlato);
         System.out.println("¿Quieres salir?");
         if (scanner.nextLine().equals("salir")){
             entrada = false;
         }
     }
     
     return this.getListaCarta();
     
    }
    
    public void imprimir (){
        for (Carta carta: getListaCarta()){ 
            System.out.println(carta.nombre+","+carta.precio+","+carta.tiempoSalida);
        }
    }

    /**
     * @return the listaCarta
     */
    public List<Carta> getListaCarta() {
        return listaCarta;
    }

    /**
     * @param listaCarta the listaCarta to set
     */
    public void setListaCarta(List<Carta> listaCarta) {
        this.listaCarta = listaCarta;
    }
}
