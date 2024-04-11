/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesjava;

import java.util.Scanner;

/**
 *
 * @author Sanda
 */
public class resolva3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salarioFixo, totalVendas, comissao, salarioFinal;
        
        System.out.println("Digite o nome do vendedor: ");
        String nome = input.nextLine();
        
        System.out.print("Digite o salário fixo do vendedor: ");
        salarioFixo = input.nextDouble();
        
        System.out.print("Digite o total de vendas efetuadas (em dinheiro): ");
        totalVendas = input.nextDouble();
        
        // cálculos
        comissao = 0.15 * totalVendas;
        salarioFinal = salarioFixo + comissao;
        
        // resultado
        System.out.println("Nome: " + nome + "\n");
        System.out.println("Salário fixo: R$" + salarioFixo + "\n");
        System.out.println("Salário no final do mês: R$" + salarioFinal);
    }
    
}
