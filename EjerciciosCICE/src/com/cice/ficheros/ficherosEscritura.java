/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ficheros;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author cice
 */
public class ficherosEscritura {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("/Users/cice/Documents/workspace/HolaMundo.txt", true)) {

            fw.write("\n");

        } catch (IOException ex) {
            System.out.println("Error");
        }

    }

}
