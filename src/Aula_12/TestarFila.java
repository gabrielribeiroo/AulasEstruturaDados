/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12;

/**
 *
 * @author gabriel.rvital
 */
public class TestarFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Fila q = new Fila();
        System.out.println(q);
        System.out.println("Tamanho da Fila: " + q.tamanho());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q);
        System.out.println("Tamanho da Fila: " + q.tamanho());
        System.out.println(q.dequeue());
        System.out.println(q);
        System.out.println("Tamanho da Fila: " + q.tamanho());
    }

}
