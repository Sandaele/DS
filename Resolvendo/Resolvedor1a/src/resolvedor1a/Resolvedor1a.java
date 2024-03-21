/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolvedor1a;

/**
 *
 * @author Aluno CA
 */

import java.util.Scanner; // Importando o Scanner

public class Resolvedor1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Declarando o Scanner
        
        int num1, num2, soma, sub, mult, div; // Declarando as variáveis
        
        // Pedindo e lendo o input do usuário
        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();
        
        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();
        
        // Cálculos
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        
        // Mostrando os resultados
        System.out.println(
                "Resultados: \n"
                + " Soma: " + soma + "\n"
                + " Subtração: " + sub + "\n"
                + " Multiplicação: " + mult + "\n"
                + " Divisão: " + div + "\n"
        );
    }
    
}
