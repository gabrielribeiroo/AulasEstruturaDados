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
public class Pilha {

    private No topo;
    private int tam;

    public Pilha() { //Cria uma pilha vazia
        this.topo = null;
        this.tam = 0;
    }

    public void empilha(Object x) {
//Inserção no início
        No aux = this.topo;
        this.topo = new No();
        this.topo.setElements(x);
        this.topo.setProx(aux);
        this.tam++;
    }

    public Object desempilha() throws Exception {
        if (this.vazia()) {
            throw new Exception("Erro : A pilha esta vazia");
        }
        Object elemento = this.topo.getElements();
        this.topo = this.topo.getProx();
        this.tam--;
        return elemento;
    }

    public boolean vazia() {
        return (this.topo == null);
    }

    public int tamanho() {
        return this.tam;
    }
}
