package Aula_02;

// @author diego.amalmeida
import java.util.Scanner;

public class Ex_02 {

    public static int leAlunos() {

        Scanner leitor = new Scanner(System.in);
        int qtd;

        do {
            System.out.println("Digite um valor entre 0 e 100");
            qtd = leitor.nextInt();

        } while (qtd < 0 || qtd > 100);

        return qtd;
    }

    public static double[] alt_aluno(int qtd) {

        Scanner leitor = new Scanner(System.in);
        
        double vet[] = new double[qtd];
        
        for(int i = 0; i < vet.length; i++){
            vet[i] = leitor.nextDouble();
        }
        
        return vet;
    }
    
    public static double maiorAltura(double [] alturas){
        
        double maior = 0;
        
        for(int i = 0; i < alturas.length; i++){
            if(alturas[i] > maior){
                maior = alturas[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {

        double alturas[] = alt_aluno(leAlunos());
        
        System.out.println("Maior altura entre os alunos é " + maiorAltura(alturas));        
    }
}
