package Aula_02;

// @author diego.amalmeida
import java.util.Scanner;

public class Ex_08 {

    public static boolean validaOrdem(int[] numero) {

        for (int i = 0; i < numero.length -1; i++) {

            if (numero[i] < numero[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static int[] populaVetorAleatorio(int[] v) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os valores dos vetores: ");
        for (int i = 0; i < v.length; i++) {
            v[i] = leitor.nextInt();
        }
        return v;
        //validaOrdem(v);
    }

    public static int[] criarVetor(int qtd) {

        int v[] = new int[qtd];
        return v;
    }

    public static int leInteiro() {

        Scanner leitor = new Scanner(System.in);
        int qtd;

        do {
            System.out.println("Especifique o tamanho do vetor: ");
            qtd = leitor.nextInt();

        } while (qtd < 0);

        return qtd;
    }

    public static void main(String[] args) {

        int numero = leInteiro();
        int[] vetor = criarVetor(numero);
        int[] ordem = populaVetorAleatorio(vetor);

        if (validaOrdem(ordem)) {
            System.out.println("Em ordem crescente");
        } else {
            System.out.println("Fora de ordem");
        }
    }
}
