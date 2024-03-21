/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturacase;

import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class EstruturaCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prática com o switch/break
        
        Scanner input = new Scanner (System.in);
        
        int num = input.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("Hoje é Domingo.");
                break;
            case 2:
                System.out.println("Hoje é Segunda-feira.");
                break;
            case 3:
                System.out.println("Hoje é Terça-feira.");
                break;
            case 4:
                System.out.println("Hoje é Quarta-feira.");
                break;
            case 5:
                System.out.println("Hoje é Quinta-feira.");
                break;
            case 6:
                System.out.println("Hoje é Sexta-feira.");
                break;    
            case 7:
                System.out.println("Hoje é Sábado.");
                break;
            default:
                System.out.println("FALHA: Este dia da semana não existe.");
                break;
        }
    }
    
}
