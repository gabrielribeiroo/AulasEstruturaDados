/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03;

import java.util.Scanner;

/**
 *
 * @author gabriel.rvital
 */
public class Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vet1 = PreencherVetor();
        trocarMaiorElementoComMenor(vet1);
        for (int i = 0; i < vet1.length; i++) {
            System.out.print(vet1[i] + " ");
        }
    }

    public static void trocarMaiorElementoComMenor(int[] vet1) {
        int max = vet1[0], min = vet1[0],imax =0,imin=0;

        for (int i = 0; i < vet1.length; i++) {
            if (vet1[i] >= max) {
                imax = i;
            }
            if (vet1[i] <= min) {
                imin = i;
            }
        }
        int aux = vet1[imax];
        vet1[imax] = vet1[imin];
        vet1[imin] = aux;
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
