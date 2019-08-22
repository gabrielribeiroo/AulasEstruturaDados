package Aula_02;

// * @author diego.amalmeida
import java.util.Scanner;

public class Ex_03 {

    public static boolean ePrimo(int n) {

        int ndiv = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                ndiv++;
            }
        }

        if (ndiv <= 2) {
            return true;
        }
        return false;
    }

    public static int leValores() {

        Scanner leitor = new Scanner(System.in);
        int qtd;

        do {
            System.out.println("Digite um número para identificar se é primo ou não");
            qtd = leitor.nextInt();

        } while (qtd < 0 || qtd > 100);

        return qtd;
    }

    public static void main(String[] args) {

        int n = leValores();
        //boolean valor = ePrimo(n);

        if (ePrimo(n)) {
            System.out.println("Número " + n + " é primo");
        } else {
            System.out.println("Número " + n + " não é primo");
        }
    }
}
