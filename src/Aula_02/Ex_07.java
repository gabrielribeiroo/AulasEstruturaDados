/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02;

import java.util.Scanner;

/**
 *
 * @author diego.amalmeida
 */
public class Ex_07 {

    public static int leInteiro() {

        Scanner leitor = new Scanner(System.in);
        int qtd;

        do {
            System.out.println("Digite um valor maior do que 0: ");
            qtd = leitor.nextInt();

        } while (qtd < 0);

        return qtd;
    }

    public static int inverteNumero(int numero) {

        int acumulador = 0;

        while (numero > 0) {

            int resto = numero % 10;
            acumulador = acumulador * 10 + resto;
            numero = numero / 10; //atualização            
        }
        return acumulador;
    }

    public static void main(String[] args) {

        int numero = leInteiro();

        if (inverteNumero(numero) == numero) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }
    }
}
