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
public class Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = solicitarNum();
        int n2 = solicitarNum();

        System.out.printf("A potencia de %d elevado a %d = %d", n1, n2, potencia(n1, n2));
    }

    public static int solicitarNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        return sc.nextInt();
    }

    public static int potencia(int a, int b) {
        if (b == 1) {
            return a;
        } else {
            return a * potencia(a, b - 1);
        }
    }
    
}
