/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_08;

import java.util.Scanner;

/**
 *
 * @author gabriel.rvital
 */
public class Ex_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        Pilha pPar = new Pilha();
        Pilha pImpar = new Pilha();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro: ");
            int n1 = leitor.nextInt();
            if (n1 % 2 == 0) {
                pPar.empilha(n1);
            } else {
                pImpar.empilha(n1);
            }
        }

        System.out.println("Pilha PAR: ");
        while (!pPar.vazia()) {
            System.out.println(pPar.desempilha());
        }
        System.out.println("Pilha IMPAR: ");
        while (!pImpar.vazia()) {
            System.out.println(pImpar.desempilha());
        }
    }

}
