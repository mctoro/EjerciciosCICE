/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class ficherosLectura {

    public static void main(String[] args) throws IOException {

        try {
            FileReader fr = new FileReader("/Users/cice/Documents/workspace/HolaMundo.txt");
            
            BufferedReader bf = new BufferedReader(fr);
            
            String texto = bf.readLine();
            
            System.out.println("El texto es: " + texto);
            
            bf.close();
            fr.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }
    }

}
