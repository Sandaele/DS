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
public class case4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("digite o código do item adquirido:");
        int codigo = input.nextInt();
        
        System.out.println("digite a quantidade adquirida:");
        int quantidade = input.nextInt();
        
        double precoUnitario;
        
        switch (codigo) {
            case 100:
                precoUnitario = 1.70;
                break;
            case 101:
                precoUnitario = 2.30;
                break;
            case 102:
                precoUnitario = 2.60;
                break;
            case 103:
                precoUnitario = 2.40;
                break;
            case 104:
                precoUnitario = 2.50;
                break;
            case 105:
                precoUnitario = 1.00;
                break;
            default:
                System.out.println("ERROR: código inválido.");
                return;
        }
        
        double valorFinal = precoUnitario * quantidade;
        System.out.println("Valor a pagar: R$ "+valorFinal);
    }
    
}
