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

        System.out.print("Ingrese un número entero sin signo (n <= 100000): ");
        int number = scanner.nextInt();
        
        if (number > 0 && number <= 1000000) {
        
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
        
        } else {
            System.out.println("Numero no es valido intene nuevamente");
        }
    }



}
