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
public class while6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Achando os dois maiores números
        Scanner input = new Scanner(System.in);
        
        int i = 1;
        int maiorNum1 = 0;
        int maiorNum2 = 0;
        
        while (i <= 10) {
            System.out.print("digite o " + i + " número: ");
            int num = input.nextInt();

            if (num > maiorNum1 && num < maiorNum2) {
                maiorNum1 = num;
            } else if (num > maiorNum1 && num > maiorNum2) {
                maiorNum2 = num;
            }
            i++;
        }
        
        System.out.println("Os dois maiores número digitado são: " + maiorNum1 + " e " + maiorNum2);
    }
    
}