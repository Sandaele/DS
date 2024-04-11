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
public class case2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       float nota1, nota2, media;
       int res;
       
        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextFloat();
        
        // cálculo
        media = (nota1 + nota2) / 2;
        
        res = 0;
        
        if (media >= 0.0 && media <= 4.0) {
            res = 1;
        } else if (media >= 4.1 && media <= 7.0) {
            res = 2;
        } else if (media >= 7.1 && media <= 10.0) {
            res = 3;
        } else {
            System.out.println("codigo invalido");
        }
        
        System.out.println("Media: " + media + "\n");
        
        switch (res) {
            case 1:
                System.out.println("Status: Reprovado");
                break;
            case 2:
                System.out.println("Status: Exame");
                break;
            case 3:
                System.out.println("Status: Aprovado");
                break;
        }
    }
    
}
