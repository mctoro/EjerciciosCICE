/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cice
 */
public class Ejercicio2v1 {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<String> listaNotas = new ArrayList<>();
        
        String dato = null;
        System.out.println("Introduce la primera nota: ");
        while (!(dato = sc.nextLine()).equals("")) {            
            listaNotas.add(dato);
            System.out.println("Introduce otra nota o pulsa enter para salir: ");
        }
        File fichero = new File("notas.txt");
        try (FileWriter fw = new FileWriter(fichero)){
            for (String nota : listaNotas) {
                fw.write(nota);
                fw.write("|");
            }
            
            
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
    
}
