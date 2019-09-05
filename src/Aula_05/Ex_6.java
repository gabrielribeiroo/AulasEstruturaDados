/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05;

import java.util.Scanner;

/**
 *
 * @author gabriel.rvital
 */
public class Ex_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = numero();
        int aux = 2;
        if (ePrimo(n1)) {
            System.out.printf("O numero %d é primo", n1);
        } else {
            System.out.printf("O numero %d não é primo", n1);
        }
    }

    public static int numero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        return sc.nextInt();
    }

    public static boolean ePrimoR(int n1, int aux) {

        if (aux == 1) {
            return true;
        }
        if (n1 % aux == 0) {
            return false;
        }

        return ePrimoR(n1, aux - 1);
    }

    public static boolean ePrimo(int n1) {
        return ePrimoR(n1, n1 - 1);
    }

}
