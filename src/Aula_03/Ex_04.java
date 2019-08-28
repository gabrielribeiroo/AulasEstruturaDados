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
public class Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vet1 = PreencherVetor();
        int[] vet = new int[2];
        vet = validarMaiorDiferenca(vet1);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }

    public static int[] validarMaiorDiferenca(int[] vet1) {
        int max = vet1[0], min = vet1[0];
        int[] v = new int[2];
        for (int i = 0; i < vet1.length -1; i++) {
            if (vet1[i] >= max) {
                max = vet1[i];
            } 
            if (vet1[i] <= min) {
                min = vet1[i];
            }

        }
        v[0] = max;
        v[1] = min;
        return v;
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
