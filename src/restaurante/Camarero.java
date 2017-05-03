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
public class Camarero extends Empleados{
    List<Camarero> empleadosLista = new ArrayList<Camarero>();
   public void Camarero(){
    setRango(RangoEnum.CAMARERO);
   }
   
    public List <Camarero> anadir (){
        boolean entrada = true;
        Scanner scanner = new Scanner(System.in);
        String fechaInicio;
        
        
        
        while (entrada){
            Camarero empleado = new Camarero();
            empleado.setRango(RangoEnum.CAMARERO);
            System.out.println("¿Cómo se llama el empleado?");  
            empleado.setNombre(scanner.nextLine());
            
            System.out.println("Inserta fecha de inicio");
            fechaInicio = scanner.nextLine();
            empleado.setFechaInicio(UtilRestaurante.FormatoFecha(fechaInicio));
            
            empleadosLista.add(empleado);
            
            System.out.println("¿Quieres salir?");
             if (scanner.nextLine().equals("salir")){
             entrada = false;
         }
        }
        
        return empleadosLista;
    }
    public void imprimir (){
        int contador = 0;
        for (Camarero empleado: empleadosLista){
            System.out.println(contador+" - "+empleado.getNombre()+","+empleado.getFechaInicio()+","+empleado.getRango().toString());
            contador++;
        }            
    }
}
