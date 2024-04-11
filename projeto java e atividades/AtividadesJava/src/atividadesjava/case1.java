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
public class case1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        float numFloat;
        int numInt;
        
        System.out.println("Digite o codigo do produto: ");
        numFloat = input.nextFloat();
        
        numInt = Math.round(numFloat * 10);
        
        switch (numInt) {
            case 10:
                System.out.println("Alimento nao-perecivel");
                break;
            case 23, 40:
                System.out.println("Alimento perecivel");
                break;
            case 50, 60:
                System.out.println("Vestuario");
                break;
            case 70:
                System.out.println("Higiene pessoal");
                break;    
            case 80, 150:
                System.out.println("Limpeza e utensilios domesticos");
                break;
            default:
                System.out.println("Código invalido");
                break;
        }
    }
    
}
