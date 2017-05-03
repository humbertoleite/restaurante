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
public class Cocinero extends Empleados {
    private String platos;
    List<Cocinero> cocineroLista = new ArrayList<Cocinero>();

   public void Cocinero(){
    this.setRango(RangoEnum.CAMARERO);
   }

    /**
     * @return the platos
     */
    public String getPlatos() {
        return platos;
    }

    /**
     * @param platos the platos to set
     */
    public void setPlatos(String platos) {
        this.platos = platos;
    }
    
  
    public List <Cocinero> anadir (){
        boolean entrada = true;
        Scanner scanner = new Scanner(System.in);
        String fechaInicio;
        
        
        
        while (entrada){
            Cocinero cocinero = new Cocinero();
            cocinero.setRango(RangoEnum.COCINERO);
            System.out.println("¿Cómo se llama el cocinero?");  
            cocinero.setNombre(scanner.nextLine());
            
            System.out.println("Inserta fecha de inicio");
            fechaInicio = scanner.nextLine();
            cocinero.setFechaInicio(UtilRestaurante.FormatoFecha(fechaInicio));
            
            cocineroLista.add(cocinero);
            
            System.out.println("¿Quieres salir?");
             if (scanner.nextLine().equals("salir")){
             entrada = false;
         }
        }
        
        return cocineroLista;
    }
    public void imprimir (){
        for (Cocinero cocinero: cocineroLista){
            System.out.println(cocinero.getNombre()+","+cocinero.getPlatos()+","+cocinero.getFechaInicio()+","+cocinero.getRango().toString());
        }            
    }
}
    