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
public class resolva2 {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double distanciaTotal, combustivelGasto, consumoMedio;
        
        System.out.println("Digite a distância total percorrida (km): ");
        distanciaTotal = input.nextDouble();
        
        System.out.println("Digite o total de combustível gasto (litros): ");
        combustivelGasto = input.nextDouble();
        
        consumoMedio = distanciaTotal / combustivelGasto;
        
        System.out.println("O consumo médio do automóvel é: " + consumoMedio + " km/l");
    }
      
}
