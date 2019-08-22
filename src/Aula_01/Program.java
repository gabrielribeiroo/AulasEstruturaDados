package Aula_01;

// @author diego.amalmeida
import java.util.Scanner;

public class Program {

    public static void mediaMaior(int soma, int[] v) {

        double media = soma / v.length;
        int qtd_maior = 0;

        for (int i = 0; i < v.length; i++) {

            if (media < v[i]) {
                qtd_maior++;
            }
        }
        System.out.println("Existem " + qtd_maior + " números maior que a média!");
    }

    public static void somaVetor(int[] v) {

        int soma = 0;

        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];            
        }
        mediaMaior(soma, v);
    }

    public static void populaVetor(int[] v) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Popule o vetor com números inteiros: ");

        for (int i = 0; i < v.length; i++) {
            v[i] = leitor.nextInt();
        }

        somaVetor(v);
    }

    public static void criarVetor(int qtd) {

        int v[] = new int[qtd];
        populaVetor(v);
    }

    public static void leValores() {

        Scanner leitor = new Scanner(System.in);
        int qtd;

        do {
            System.out.println("Quantos elementos terá o vetor? (Digite um número inteiro positivo (Entre 1 e 100)");
            qtd = leitor.nextInt();
            
        } while (qtd < 0 || qtd > 100);
        criarVetor(qtd);
    }

    public static void main(String[] args) {

        leValores();
    }
}
