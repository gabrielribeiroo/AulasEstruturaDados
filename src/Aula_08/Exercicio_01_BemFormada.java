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
public class Exercicio_01_BemFormada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String seq;
        System.out.println("Digite uma sequência de parenteses e colchetes: ");
        seq = leitor.next();
        Pilha p = new Pilha();
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(' || seq.charAt(i) == '[') {
                p.empilha(seq.charAt(i));
            } else {
                if (p.vazia()) {
                    System.out.println("Não está bem formada a sequência");
                    return;
                }
                char charTopo = (char) p.desempilha();

                if (charTopo == '(' && seq.charAt(i) == ']') {
                    System.out.println("Não está bem formada a sequência");
                    return;
                }
                if (charTopo == '[' && seq.charAt(i) == ')') {
                    System.out.println("Não está bem formada a sequência");
                    return;
                }
            }
        }
        if (p.vazia()) {
            System.out.println("Está bem Formada a sequência");
        } else {
            System.out.println("Não está bem formada a sequência");
        }
    }

}
