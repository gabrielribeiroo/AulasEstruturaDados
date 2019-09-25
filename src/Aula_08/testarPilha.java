/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_08;

/**
 *
 * @author gabriel.rvital
 */
public class testarPilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception  {
        // TODO code application logic here
        Pilha p = new Pilha();
        p.empilha("Gabriel");
        p.empilha("Ribeiro");
        p.empilha("Vital");
        p.empilha(22);
        System.out.println(p.desempilha());
        System.out.println(p.desempilha());
        System.out.println(p.desempilha());
        System.out.println(p.desempilha());
        
    }
    
}
