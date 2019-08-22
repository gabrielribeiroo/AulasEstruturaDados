package Aula_02;

// @author diego.amalmeida
import java.util.Scanner;

public class Ex_04 {

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
            System.out.println("Digite um valor entre 0 e 100");
            qtd = leitor.nextInt();

        } while (qtd < 0 || qtd > 100);

        return qtd;
    }

    public static void main(String[] args) {

        int n1 = leValores();
        int n2 = leValores();
        //boolean valor = ePrimo(n);

        for (int i = n1; i <= n2; i++) {
            if (ePrimo(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
