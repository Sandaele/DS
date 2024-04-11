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
public class while7 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Quadrado de asteriscos
        Scanner input = new Scanner(System.in);
        
        System.out.print("digite o tamanho do lado do quadrado (entre 1 e 20): ");
        int tamanho = input.nextInt();
        
        int linha = 1;
        while (linha <= tamanho) {
            int coluna = 1;
            while (coluna <= tamanho) {
                System.out.print("*");
                coluna++;
            }
            System.out.println();
            linha++;
        }
    }
    
}
