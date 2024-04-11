/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesjava;

import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class forTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("digite o número: ");
        int num = input.nextInt();
        int i;
        
        for (i=1; i<=10; i++) {
            int res = num * i;
            System.out.println(num+" * "+ i + " = " + res);
        }
    }
    
}
