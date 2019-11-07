/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_14;

/**
 *
 * @author gabriel.rvital
 */
public class testeABB {
    
    public static void main(String[] args) {
        ABB tree = new ABB();
        tree.insere(8);
        tree.insere(2);
        tree.insere(5);
        tree.insere(7);
        tree.insere(9);
        tree.insere(3);
        tree.insere(11);
        tree.insereR(10);
        tree.preOrdem();
        System.out.println("");
        tree.inOrdem();
        System.out.println("");
        tree.posOrdem();
        System.out.println("");
        tree.remove(5);
        tree.posOrdem();
        
    }
    
}
