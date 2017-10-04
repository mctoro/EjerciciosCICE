/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cice
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {

        
        File file = new File("ejercicio2.txt");
        
        Scanner sc = new Scanner(System.in);
        
        /*        int opcion = 0;
        
        
        if (opcion !=0) {
        JOptionPane.showInputDialog(null, "Introduce un numero", "Introducción", JOptionPane.INFORMATION_MESSAGE);
        } else {
        System.out.println("Gracias");
        
        
        }*/
        
        
        
        
        
        try (FileWriter fw = new FileWriter(file, true)){
            
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            System.out.println("Introduce un numero"); 
            
            int opcion=0;
            
       
            
            bw.write(sc.nextInt()+"|");
            bw.write(sc.nextInt()+"|");
            
            
            bw.close();
        
        
        

        
        
        
        
        
        } catch (IOException ex) {
        System.out.println("Error");
        }
       
              
        
    }
    
}
