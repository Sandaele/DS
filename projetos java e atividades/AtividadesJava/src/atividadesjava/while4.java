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
public class while4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa em Java que calcula a média das notas de uma turma
        Scanner input = new Scanner(System.in);
        
        System.out.print("digite a quantidade de alunos: ");
        int quantAlunos = input.nextInt();
        
        int i = 1;
        double somaNotas = 0.0;
        
        while (i <= quantAlunos) {
            System.out.print("digite a nota do aluno " + i + ": ");
            double nota = input.nextDouble();
            somaNotas += nota;
            i++;
        }
        
        double media = somaNotas / quantAlunos;
        System.out.println("a média da turma é: " + media);
    }
    
}
