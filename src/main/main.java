/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
/**
 *
 * @author CruzArdila
 */
public class main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear un arreglo cual nos permita almacenar cien números enteros.
        
        int enteros[] = new int[100];
        
        for(int numero = 0; numero < enteros.length; numero++ ){
        
        //Random para el arreglo
        int numeros = (int)(Math.random() * 100);
        
        enteros[numero]=numeros;
        System.out.print(numeros + ";");
        
        
    }
        System.out.println("");
    
        int mayor = 0;
        for(int i = 0; i < enteros.length; i++){
        
       
        if(enteros[i] > mayor){
        
            mayor = enteros[i];
        }
        
        
    }
        System.out.println("El numero mayor del arreglo es " +mayor);
    
       
         
        
    
    
    } 
       
    
    
    
}
