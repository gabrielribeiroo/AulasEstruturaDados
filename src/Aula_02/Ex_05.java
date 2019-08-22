package Aula_02;

// @author diego.amalmeida
import java.util.Scanner;

public class Ex_05 {

    public static int leInteiro() {

        Scanner leitor = new Scanner(System.in);
        int qtd;

        do {
            System.out.println("Digite um valor entre 0 e 100");
            qtd = leitor.nextInt();

        } while (qtd < 0 || qtd > 100);

        return qtd;
    }

    public static int dec2Bin(int decimal) {

        int bin = 0;
        int cont = 0;

        while (decimal > 0) {
            int resto = decimal % 2;
            bin += resto * Math.pow(10, cont);
            decimal = decimal / 2; //atualização
            cont++;
        }
        return bin;
    }

    public static void main(String[] args) {

        int decimal = leInteiro();

        System.out.println("Decimal " + " == " + dec2Bin(decimal));
    }
}
