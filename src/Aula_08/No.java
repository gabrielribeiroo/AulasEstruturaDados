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
public class No {

    private Object elemento;
    private No prox;

    public No(){}
    
    public No(Object elemento, No prox) {
        this.elemento = elemento;
        this.prox = prox;
    }

    /**
     * @return the elements
     */
    public Object getElements() {
        return elemento;
    }

    /**
     * @param elements the elements to set
     */
    public void setElements(Object elements) {
        this.elemento = elements;
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
        return "No{" + "elements=" + elemento + ", prox=" + prox + '}';
    }

    
}
