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
public class Ex_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String frase = leitor.nextLine();
        boolean bin = inverterFrase(frase);
        if (bin == true) {
            System.out.println("é palindromo");
        } else {
            System.out.println("não é palindromo");
        }

    }

    public static boolean inverterFrase(String frase) throws Exception {
        Pilha p = new Pilha();
        String bin = "";
        for (int i = 0; i < frase.length(); i++) {
            p.empilha(frase.charAt(i));
        }
        while (!p.vazia()) {
            bin = bin + p.desempilha();
        }
        if (bin.equals(frase)) {
            return true;
        } else {
            return false;
        }
    }

}
