/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author CruzArdila
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear un arreglo cual nos permita almacenar cien números enteros.
        
        int enteros[] = new int[100];
        
        for(int numero = 0; numero < enteros.length; numero++ ){
        
        int numeros = (int)(Math.random() * 100);
        
        System.out.println(numeros);
        
        
        }
        
        
    }
    
}
