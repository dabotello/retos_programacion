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
public class C {
    
  public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);


        int casosPrueba = scanner.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            System.out.print("Ingrese el numero de items: ");
            int x = scanner.nextInt();
            System.out.print("Ingrese el precio unitariode los items: ");
            int y = scanner.nextInt();

            int result = x * y;
            
            
            String numeroStr = String.valueOf(result);
            boolean validNumber = numeroStr.length() == 5 && !numeroStr.startsWith("0");

            if (validNumber) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
    
}
