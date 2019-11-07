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
public class ABB {

    private No raiz;

    //criar uma Arvoe vazia
    public ABB() {
        this.raiz = null;
    }

    public void insere(int elemento) {
        No pai = null;
        No p = raiz;
        No novo = new No(elemento, null, null);

        //busca a onde inserir o novo No
        while (p != null) {
            pai = p;
            if (elemento < p.getElemento()) {
                p = p.getEsq();
            } else {
                p = p.getDir();
            }
        }
        //arvore ser vazia
        if (pai == null) {
            raiz = novo;
        } else {
            if (elemento < pai.getElemento()) {
                pai.setEsq(novo);
            } else {
                pai.setDir(novo);
            }
        }

    }

    public void preOrdem() {
        preOrdem(raiz);
    }

    private void preOrdem(No p) {
        if (p != null) {
            System.out.print(p.getElemento() + " ");
            preOrdem(p.getEsq());
            preOrdem(p.getDir());
        }
    }

    public void inOrdem() {
        inOrdem(raiz);
    }

    private void inOrdem(No p) {
        if (p != null) {
            inOrdem(p.getEsq());
            System.out.print(p.getElemento() + " ");
            inOrdem(p.getDir());
        }
    }

    public void posOrdem() {
        posOrdem(raiz);
    }

    private void posOrdem(No p) {
        if (p != null) {
            posOrdem(p.getEsq());
            posOrdem(p.getDir());
            System.out.print(p.getElemento() + " ");
        }
    }

    public No buscarR(int elemento) {
        return buscarR(elemento, raiz);
    }

    private No buscarR(int elemento, No p) {
        if (p == null) {
            return null; //não encontrado
        }
        if (elemento == p.getElemento()) {
            return p; //quando localizado
        }
        if (elemento < p.getElemento()) {
            return buscarR(elemento, p.getEsq());
        } else {
            return buscarR(elemento, p.getDir());
        }
    }

    public No buscaIte(int elemento) {
        No p = raiz;

        while (p != null) {
            if (elemento == p.getElemento()) {
                return p;
            } else if (elemento < p.getElemento()) {
                p = p.getEsq();
            } else {
                p = p.getDir();
            }
        }
        return null;//Não achou
    }

    public void insereR(int elemento) {
        if (raiz == null) {
            raiz = new No(elemento, null, null);
        } else {
            No novo = new No(elemento, null, null);
            insereR(raiz, novo);
        }
    }

    private void insereR(No p, No novo) {
        if (novo.getElemento() < p.getElemento()) {
            if (p.getEsq() == null) {
                p.setEsq(novo);
            } else {
                insereR(p.getEsq(), novo);
            }
        } else {
            if (p.getDir() == null) {
                p.setDir(novo);
            } else {
                insereR(p.getDir(), novo);
            }
        }
    }

    public No maiorR() {

        return maiorR(raiz);
    }

    private No maiorR(No p) {
        if (p.getDir() == null) {
            return p;
        } else {
            return maiorR(p.getDir());
        }
    }

    public No menor() {
        No p = raiz;
        if (p.getEsq() != null) {
            p = p.getEsq();
        }
        return p;
    }

    public No menorR() {

        return maiorR(raiz);
    }

    private No menorR(No p) {
        if (p.getEsq() == null) {
            return p;
        } else {
            return maiorR(p.getEsq());
        }
    }

    public No remove(int elemento) {
        return remove(raiz, elemento);
    }

    private No remove(No p, int elemento) {
        if (p == null) {
            return null;
        }
        if (elemento < p.getElemento()) {
            p.setEsq(remove(p.getEsq(), elemento));
        } else if (elemento > p.getElemento()) {
            p.setDir(remove(p.getDir(), elemento));
        } else {
            if (p.getEsq() != null) {
                No aux = maiorR(p.getEsq());
                p.setElemento(aux.getElemento());
                p.setEsq(remove(p.getEsq(), aux.getElemento()));
            } else if (p.getDir() != null) {
                No aux = menorR(p.getDir());
                p.setElemento(aux.getElemento());
                p.setDir(remove(p.getDir(), aux.getElemento()));
            } else {
                return null;
            }
        }
        return p;
    }
}
