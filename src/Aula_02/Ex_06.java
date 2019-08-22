package Aula_02;

// @author diego.amalmeida
import java.util.Scanner;

public class Ex_06 {

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

        int decimal = leInteiro();

        System.out.println("Número " + " == " + inverteNumero(decimal));
    }
}
