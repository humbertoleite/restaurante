/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.List;

/**
 *
 * @author hlman
 */
public class Restaurante {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carta carta = new Carta();
        carta.anadir();
        carta.imprimir();        
        
        Cocinero cocinero = new Cocinero();
        cocinero.anadir();
        cocinero.imprimir();
        
    }
    
}
