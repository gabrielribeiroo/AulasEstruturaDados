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
public class Ex_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = solicitarNum();
        System.out.printf("A soma dos digitos do número %d = %d", n1, calcDigitos(n1));
    }

    public static int solicitarNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        return sc.nextInt();
    }

    public static int calcDigitos(int dig) {
        if (dig < 10) {
            return dig;
        } else {
            return dig % 10 + calcDigitos(dig / 10);
        }
    }

}
