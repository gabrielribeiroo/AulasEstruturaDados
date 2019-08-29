/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04;

import java.util.Scanner;

/**
 *
 * @author gabriel.rvital
 */
public class Ex_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vet1 = PreencherVetor();
        int maiorSequen = maiorSequencia(vet1);
        System.out.println("A maior Sequencia de crescente é de tamanho: " + maiorSequen);
    }

    public static int maiorSequencia(int[] vet1) {
        int seq = 1, maiorSeq = 0;

        for (int i = 0; i < vet1.length - 1; i++) {
            if (vet1[i] < vet1[i + 1]) {
                seq++;
            } else {
                if (seq > maiorSeq) {
                    maiorSeq = seq;
                }
                seq = 1;
            }
        }

        if (maiorSeq > seq) {
            return maiorSeq;
        } else {
            return seq;
        }
    }

    public static int[] PreencherVetor() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tamanho do Vetor");
        int size = leitor.nextInt();
        int[] vet = populaVetorAleatorio(size);
        return vet;
    }

    public static int[] populaVetorAleatorio(int size) {
        int[] v = new int[size];
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os valores dos vetores: ");
        for (int i = 0; i < v.length; i++) {
            v[i] = leitor.nextInt();
        }
        return v;
        //validaOrdem(v);
    }
}
