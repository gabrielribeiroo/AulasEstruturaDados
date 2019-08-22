package Aula_02;

// @author diego.amalmeida
import java.util.Scanner;

public class Ex_09 {
    
    public static int contaSubsequencia(int [] v){
        
     int cont = 0;
     
     for(int i = 0; i < v.length - 1; i++){
         
         if(v[i] != v[i + 1]){
             cont++;
         }          
     }        
      return cont + 1;  
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
            System.out.println("Especifique a quantidade de elementos: ");
            qtd = leitor.nextInt();

        } while (qtd < 0);

        return qtd;
    }

    public static void main(String[] args) {

        int numero = leInteiro();
        int[] vetor = criarVetor(numero);
        int[] ordem = populaVetorAleatorio(vetor);
        int sequencia = contaSubsequencia(ordem);
        
        System.out.println("Existem " + sequencia);
    }

}
