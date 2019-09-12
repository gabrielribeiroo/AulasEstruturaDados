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
public class No {

    private int elements;
    private No prox;

    public No(int elemento, No prox) {
        this.elements = elemento;
        this.prox = prox;
    }

    /**
     * @return the elements
     */
    public int getElements() {
        return elements;
    }

    /**
     * @param elements the elements to set
     */
    public void setElements(int elements) {
        this.elements = elements;
    }

    /**
     * @return the prox
     */
    public No getProx() {
        return prox;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(No prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "No{" + "elements=" + elements + ", prox=" + prox + '}';
    }

    
}
