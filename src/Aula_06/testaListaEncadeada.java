/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06;

/**
 *
 * @author gabriel.rvital
 */
public class testaListaEncadeada {

    public static void main(String[] args) {
        /**
         * No p = new No(10,null); No q = new No(20,p); No l = new No(30,q);
         * System.out.println(l);
        *
         */

        ListaEncadeada lst = new ListaEncadeada();
        lst.insereInicio(30);
        lst.insereInicio(20);
        lst.insereInicio(10);
        lst.insereFinal(40);
        lst.insereFinal(50);
        lst.insereOrdenado(35);
        lst.insereOrdenado(5);
        lst.insereOrdenado(85);
        System.out.println(lst);
        System.out.println(lst.buscaLinear(20));
        System.out.println(lst.buscaLinear(13));
        System.out.println(lst.buscaLinear2(40));
        System.out.println(lst.buscaLinear2(42));
        System.out.println(lst.buscaLinearRecurcivaR(40));
        System.out.println(lst.buscaLinearRecurcivaR(42));
        System.out.println(lst.buscaLinear2RecursivaR(40));
        System.out.println(lst.buscaLinear2RecursivaR(42));
        lst.insereFinalR(33);
        lst.insereFinalR(44);
        System.out.println(lst);
        lst.insereOrdenadoR(3);
        lst.insereOrdenadoR(39);
        lst.insereOrdenadoR(13);
        System.out.println(lst);
        lst.removerInicio();
        System.out.println(lst);
        lst.removerFinal();
        System.out.println(lst);
        lst.removerOrdenado(35);
        System.out.println(lst);
        lst.removerOrdenado(13);
        System.out.println(lst);
        lst.removerOrdenado(33);
        System.out.println(lst);
        lst.removerFinalRecursivo();
        System.out.println(lst);
        lst.inverterLista();
        System.out.println(lst);


    }
}
