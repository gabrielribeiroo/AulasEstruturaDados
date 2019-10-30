/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12;

import Aula_08.No;

/**
 *
 * @author gabriel.rvital
 */
public class Fila {

    private No first;
    private No last;
    private int tam;

    public Fila() {
        this.first = this.last = null;
        this.tam = 0;
    }

    //verifica se a fila está vazia
    public boolean isEmpty() {
        return this.first == null && this.last == null;
    }

    public void enqueue(Object x) {
        No novo = new No(x, null);
        if (last != null) {
            this.last.setProx(novo);
            this.last = this.last.getProx();
            tam++;
        } else {
            this.first = novo;
            this.last = novo;
            tam++;
        }
    }

    public Object dequeue() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Error: Fila Vazia");
        } else {
            Object elemento = this.first.getElements();
            this.first = this.first.getProx();
            this.tam--;
            return elemento;
        }
    }

    @Override
    public String toString() {
        return "Fila{" + "first=" + first + ", last=" + last + '}';
    }

    public int tamanho() {
        return this.tam;
    }

  

}
