/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciosalbertocaracuel;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alberto
 */
public class Ej8array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digame el tamaño del array");
        int valores = sc.nextInt();
        int[] array1 = new int[valores];

        int mostrar = 0;
        char mostrar1 = 0;
        
        try {
            System.out.println("Introduce lo que quiera que mueste el array");
            mostrar = sc.nextInt();
        } catch (InputMismatchException ime) {
            sc.nextLine();
            System.out.println("Vuelva a introducir lo que quiera que mueste el array");
            mostrar1 = sc.next().charAt(0);
        }
       
        do {
            for (int i = 0; i < valores; i++) {
                if(mostrar!=0){
                    array1[i] = mostrar;

                System.out.print(array1[i] + " - ");
                }else{
                    char array2= (char) array1[i];
                    array2=mostrar1;
                    System.out.print(array2 + " - ");
                }
            }
            System.out.println("\n");
            valores--;
        } while (valores != 0);
        
        
    }
}
