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
public class Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número decimal para conversão: ");
        int dec = leitor.nextInt();
        String bin = dec2Bin(dec);
        System.out.println("Valor em Binário: " + bin);

    }

    public static String dec2Bin(int dec) throws Exception {
        Pilha p = new Pilha();
        String bin = "";
        while (dec > 0) {
            p.empilha(dec % 2);
            dec = dec / 2;
        }
        while (!p.vazia()) {
            bin += p.desempilha();
        }
        return bin;
    }

}
