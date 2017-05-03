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
public class UtilRestaurante {
    
    public static Date FormatoFecha(String fecha){
        String[] fechaFormatada = fecha.split("/");
        
        int dia = Integer.parseInt(fechaFormatada[0]);
        int mes = Integer.parseInt(fechaFormatada[1]);
        int ano = Integer.parseInt(fechaFormatada[2]);
        
        return new Date(ano,mes,dia);
                
    }
}
