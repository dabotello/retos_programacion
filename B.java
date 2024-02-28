package prueba.tecnica;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diegobotello
 */



public class B {
    
       public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero sin signo (n <= 100000): ");
        

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n >= 0 && n <= 100000) {
                System.out.println("Número válido: " + n);
                
                int rows = n;
                int columns =n;
                int[][] matrix = new int[rows][columns];
                
                int count = n;
                
                for(int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        
                        if(j+1<n){
                            System.out.print(1 + " "); 
                        }
                        else{
                            if(j+1 == n){
                                System.out.print(n + " "); 
                            }else{
                                System.out.print(0 + " "); 
                            }
                            
                        }
                        
                    }
                    n--;
                    System.out.println();
                }
                
                
            } else {
                System.out.println("Número fuera de rango. Debe ser un número entero no negativo y n <= 100000.");
            }
        } else {
            System.out.println("Entrada no válida. Debe ser un número entero.");
        }

        scanner.close();
    }
    
}
