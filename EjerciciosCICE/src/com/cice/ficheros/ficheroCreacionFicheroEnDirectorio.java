/*
A continuación vamos a realizar un programa que, a partir de un fichero llamado notas.txt que
contiene un listado de notas de alumnos, realice la lectura de todas las notas y nos muestre en
pantalla la nota media total. Cada nota estará́separada de la siguiente por una barra vertical
(“|”) y podrá tener cifras decimales, además, el conjunto total de notas puede ocupar varias
líneas dentro del archivo, por ejemplo:
4.5|3|3.75| 8|6.8
En este ejemplo se supone que el fichero se encuentra en el directorio del proyecto.
 */
package com.cice.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



/**
 *
 * @author cice
 */
public class ficheroCreacionFicheroEnDirectorio {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        

        FileReader fr = new FileReader("/Users/cice/Desktop/notas.txt");
        BufferedReader bf = new BufferedReader(fr);
        
        String notas = null;
        String cadenasLeidas = "";
        
        while((notas = bf.readLine()) != null){
            cadenasLeidas += notas + "|";
            
        }
        
        System.out.println(cadenasLeidas);
        
        
        String[] separado = cadenasLeidas.split("\\|");
        double sumaNotas = 0.0;
        
        for (String nota : separado) {
            sumaNotas += Double.parseDouble(nota);
            
           
          
          
        }
        double media = sumaNotas/separado.length;
            System.out.println(sumaNotas);
            System.out.println("La media es: " + media);
        
            
        }
        
        
       
        
        
        
        
    }
    
    
    

