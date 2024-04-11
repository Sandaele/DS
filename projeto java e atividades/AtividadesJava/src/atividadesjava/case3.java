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
public class case3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("digite o primeiro número:");
        double num1 = input.nextDouble();
        
        System.out.println("digite o segundo número:");
        double num2 = input.nextDouble();
        
        System.out.println("escolha a operação:");
        System.out.println("1. média entre os números digitados");
        System.out.println("2. diferença entre os números");
        System.out.println("3. produto entre os números digitados");
        System.out.println("4. divisão do primeiro pelo segundo");
        
        int escolha = input.nextInt();
        
        switch (escolha) {
            case 1:
                double media = (num1 + num2) / 2;
                System.out.println("a média é: " + media);
                break;
            case 2:
                double sub = num1 - num2;
                System.out.println("a diferença é: "+sub);
                break;
            case 3:
                double mult = num1 * num2;
                System.out.println("o produto é: "+mult);
                break;
            case 4:
                double div = num1 / num2;
                System.out.println("a divisão é: "+div);
            default:
                System.out.println("ERROR: código inválido.");
        } 
    }
    
}
