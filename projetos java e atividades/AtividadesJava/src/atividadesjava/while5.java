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
public class while5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Achando o maior número
        Scanner input = new Scanner(System.in);
        
        int i = 1;
        int maiorNum = 0;
        
        while (i <= 10) {
            System.out.print("digite o " + i + " número: ");
            int num = input.nextInt();

            // se o número digitado for maior que o ultimo maior número ele substitui o maior pelo atual
            if (num > maiorNum) {
                maiorNum = num;
            }
            i++;
        }
        
        System.out.println("O maior número digitado é: " + maiorNum);
    }
    
}