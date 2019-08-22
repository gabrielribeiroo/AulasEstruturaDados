package Aula_02;

// @author diego.amalmeida
import java.util.Scanner;

public class Ex_05b {

    public static int leInteiro() {

        Scanner leitor = new Scanner(System.in);
        int qtd;

        do {
            System.out.println("Digite um valor binário");
            qtd = leitor.nextInt();

        } while (qtd < 0);

        return qtd;
    }

    public static int bin2Dec(int bin) {

        int decimal = 0;
        int cont = 0;

        while (bin > 0) {
            int resto = bin % 10;
            decimal += resto * Math.pow(2, cont);
            bin = bin / 10; //atualização
            cont++;
        }
        return decimal;
    }

    public static void main(String[] args) {

        int decimal = leInteiro();

        System.out.println("Decimal " + " == " + bin2Dec(decimal));

    }

}
