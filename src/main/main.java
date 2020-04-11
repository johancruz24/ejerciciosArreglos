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
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear un arreglo cual nos permita almacenar cien números enteros.
        
        int enteros[] = new int[100];
        
        for(int numero = 0; numero < enteros.length; numero++ ){
        
        //Random para el arreglo
        int numeros = (int)(Math.random() * 101);
        
        enteros[numero]=numeros;
        System.out.print(numeros + ";");
        
        
    }
        System.out.println("");
    
        //Calcular el número mayor del arreglo
        int mayor = 0;
        for(int i = 0; i < enteros.length; i++){
        
       
        if(enteros[i] > mayor){
        
            mayor = enteros[i];
        }
        
        
    }   
        System.out.println("/***********************************************************/");
        System.out.println("El numero mayor del arreglo es " +mayor);
        System.out.println("/***********************************************************/");
        //Calcular número menor del arreglo
        int menor = mayor;
    
        for(int j = 0; j < enteros.length; j++){
        
            if(enteros[j]<menor){
            
                menor = enteros[j];
        
            }
    
        }
        System.out.println("/***********************************************************/");
        System.out.println("El número menor del arreglo es "+menor);
        System.out.println("/***********************************************************/");
        
        
        int cont=0;
        int primos[] = new int[50]; 
        for(int entero : enteros){
        int aux=0;  
        for(int a=1; a <= entero; a++){
         
        if(entero % a == 0){
            
            aux++;
        }
        }
        if(aux == 2){
            
            primos[cont]=entero;
            cont++;
           
        }
        
        }
        System.out.println("/***********************************************************/");
        System.out.println("Los número primos del arreglo son " );
        for(int primo : primos){
        
         System.out.print(+primo+ "-");
        }
        System.out.println("");
        System.out.println("/***********************************************************/");
        
        
        int contPar=0;
        int pares[] = new int[100];
        for(int entero : enteros){            
            if(entero % 2 == 0){                
                pares[contPar]=entero;
                contPar++;            
                      }       
        }
        System.out.println("/***********************************************************/");
        System.out.println("Los números pares del arreglo son: ");
        for(int par:pares){
        
            System.out.print(+par+ ",");
        }
        System.out.println("");
        System.out.println("/***********************************************************/");
    
        
    for(int o = 0; o < (enteros.length-1);o++){          
       for(int k = 0; k <(enteros.length-1);k++){
           if(enteros[k]>enteros[k+1]){
               int aux = enteros[k];
               enteros[k] = enteros[k+1];
               enteros[k+1] = aux;
               
           }       
       }
       
    }
    System.out.println("/***********************************************************/");
    System.out.println("El arreglo ordenado es : ");
    for(int entero : enteros){
    System.out.print(entero+"-");
    }
    System.out.println("");
        System.out.println("/***********************************************************/");    
    
        
    for(int entero : enteros){
        System.out.print(entero);
    }
    }    
}


