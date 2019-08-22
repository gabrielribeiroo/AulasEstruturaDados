package Aula_03;

// @author diego.amalmeida
import java.util.Random;
import java.util.Scanner;

public class Ex_02 {

    public static void imprimirVetor(int [] v){
        
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    
    public static void populaVetorAleatorio(int[] v) {

        Random aleatorio = new Random();
        //Scanner leitor = new Scanner(System.in);        
        //System.out.println("Popule o vetor com números inteiros: ");        
        for (int i = 0; i < v.length; i++) {
            v[i] = aleatorio.nextInt(5) + 1;
        }     
    }

    public static int leValores() {

        Scanner leitor = new Scanner(System.in);
        int qtd;

        do {
            System.out.println("Quantos elementos terá o vetor? (Digite um número inteiro positivo (Entre 1 e 100)");
            qtd = leitor.nextInt();

        } while (qtd < 0 || qtd > 100);
        return qtd;
    }
    
    public static void inverterVetor(int [] vetor){
        
        int inicio = 0;
        int fim = vetor.length - 1;
        
        while(inicio < fim){
            int aux = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = aux;
            inicio++;
            fim--;
        }                
    }

    public static void main(String[] args) {

        int qtd = leValores();
        int[] vetor = new int[qtd];
        populaVetorAleatorio(vetor);
        imprimirVetor(vetor);        
        inverterVetor(vetor);
        imprimirVetor(vetor);        
    }
}
