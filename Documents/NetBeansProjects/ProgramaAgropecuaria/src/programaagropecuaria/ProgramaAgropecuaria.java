/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaagropecuaria;

import java.util.Scanner;


public class ProgramaAgropecuaria {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner grao = new Scanner(System.in);
        System.out.println("Qual o tipo de grão? milho=1; arroz= 2; trigo = 3");
        int tipoGrao = grao.nextInt();
        System.out.println("Qual a quantia em kg?");
        double quantiakg = grao.nextDouble();
        double valorPorKg = 0;
        switch (tipoGrao) {
            case 1:
                System.out.println(valorPorKg = 2.00);
                break;
            case 2:
                System.out.println(valorPorKg = 4.00);
                break;
            case 3:
                System.out.println(valorPorKg = 8.00);
                break;
            default:
                System.out.println("tipo de grão inválido!");
                break;
        }
       double res = valorPorKg * quantiakg;
        System.out.println("O valor do grão é: " + res + " reais");
        
        
    }
    
}
