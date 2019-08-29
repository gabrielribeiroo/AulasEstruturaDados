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
public class Ex_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vet1 = {3, 5, 7, 9, 12};
        int[] vet2 = {4, 5, 9, 12, 66};
        Interceccao(vet1, vet2);

    }

    public static void Interceccao(int[] v1, int[] v2) {
        int i = 0, j = 0;

        while (i < v1.length) {
            if (v1[i] == v2[j]) {
                System.out.println("Instersecção: " + v1[i]);
                i++;
                j++;
            } else{
                i++;
                if(v1[i] > v2[j]){
                    j++;
                }
            }

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
