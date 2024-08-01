/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor;

import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // criar uma array de 5 valores que o usuario digita
        Scanner input = new Scanner(System.in);
        
        int num[] = new int[5];
        
        for (int i=0; i<5; i++) {
            System.out.println("digite um número: ");
            num[i] = input.nextInt();
        }
        
        for (int j=0; j<5; j++) {
            System.out.println("indice: "+j+", valor: "+num[j]);
        }
    }
    
}
