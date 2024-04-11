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
public class resolva1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2, soma, sub, mult, div;
        
        // pedindo e lendo o input do usuário
        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();
        
        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();
        
        // cálculos
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        
        // mostrando os resultados
        System.out.println(
                "Resultados: \n"
                + " Soma: " + soma + "\n"
                + " Subtração: " + sub + "\n"
                + " Multiplicação: " + mult + "\n"
                + " Divisão: " + div + "\n"
        );
    }
    
}
