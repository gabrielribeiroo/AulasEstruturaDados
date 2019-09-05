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
public class Ex_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = numero();
        int n2 = numero();
        System.out.printf("Resto da divisão de %d por %d  = %d", n1, n2, result(n1, n2));
    }

    public static int numero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        return sc.nextInt();
    }

    public static int result(int n1, int n2) {
        if (n1 < n2) {
            return n1;
        } else {
            return result(n1 - n2, n2);
        }
    }

}
