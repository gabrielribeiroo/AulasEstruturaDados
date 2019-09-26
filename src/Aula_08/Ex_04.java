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
public class Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String frase = leitor.nextLine();
        String bin = inverterFrase(frase);
        System.out.println("Frase invertida por palavra: " + bin);

    }

    public static String inverterFrase(String frase) throws Exception {
        Pilha p = new Pilha();
        String bin = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ' || frase.charAt(i) == '.') {
                while (!p.vazia()) {
                    bin = bin + p.desempilha();
                }
                bin = bin + frase.charAt(i);
            } else {
                p.empilha(frase.charAt(i));
            }
        }
        return bin;
    }

}
