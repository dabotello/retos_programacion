/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.tecnica;

import java.util.Scanner;

/**
 *
 * @author diegobotello
 */
public class D {
    
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


        int number = scanner.nextInt();
        
        int squared = number * number;

        String numberStr = String.valueOf(number);
        String squaredStr = String.valueOf(squared);

        boolean cuadrado = squaredStr.endsWith(numberStr);

        if (cuadrado) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }



}
