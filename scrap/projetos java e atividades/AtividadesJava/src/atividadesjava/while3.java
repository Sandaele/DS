/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesjava;

import java.util.Scanner;

/**
 *
 * @author sanda
 */
public class while3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa em Java que mostra os números pares e ímpares
        Scanner input = new Scanner(System.in);
        
        System.out.print("digite um número inteiro: ");
        int num = input.nextInt();
        
        System.out.println("números pares:");
        int numPar = 2;
        while (numPar <= num) {
            System.out.print(numPar + " ");
            numPar += 2;
        }
        
        System.out.println("\n"+"números ímpares:");
        int numImpar = 1;
        while (numImpar <= num) {
            System.out.print(numImpar + " ");
            numImpar += 2;
        }
    }
    
}
