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
public class ListaEncadeada {

    private No ini;

    public ListaEncadeada() {
        this.ini = null;
    }

    public boolean vazia() {
        return ini == null;
    }

    @Override
    public String toString() {
        String strList = "";
        No temp = ini;
        while (temp != null) {
            strList += temp.getElements() + " ";
            temp = temp.getProx();
        }
        return strList;
    }

    public void insereInicio(int elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }

    public void insereFinal(int elemento) {
        No novo = new No(elemento, null);
        No temp = ini;
        if (temp == null) {
            ini = novo;
        } else {
            while (temp.getProx() != null) {
                temp = temp.getProx();
            }
            temp.setProx(novo);
        }
    }

    public void insereOrdenado(int elemento) {
        No novo = new No(elemento, null);
        No temp = ini;
        No anterior = null;

        while (temp != null && temp.getElements() < novo.getElements()) {
            anterior = temp;
            temp = temp.getProx();
        }
        if (anterior == null) {
            novo.setProx(ini.getProx());
            ini = novo;
        } else {
            novo.setProx(anterior.getProx());
            anterior.setProx(novo);
        }
    }

    public boolean buscaLinear(int x) {
        No temp = ini;
        boolean busca = false;
        while (temp != null) {
            if (temp.getElements() == x) {
                return true;
            }
            temp = temp.getProx();
        }
        return false;
    }

    public No buscaLinear2(int x) {
        No temp = ini;
        boolean busca = false;
        while (temp != null) {
            if (temp.getElements() == x) {
                return temp;
            }
            temp = temp.getProx();
        }
        return null;
    }

    public boolean buscaLinearRecurcivaR(int x) {
        return buscaLinearRecurciva(ini, x);
    }

    public boolean buscaLinearRecurciva(No temp, int x) {
        if (temp == null) {
            return false;
        }

        if (temp.getElements() == x) {
            return true;
        }
        return buscaLinearRecurciva(temp.getProx(), x);
    }

    public No buscaLinear2RecursivaR(int x) {
        return buscaLinear2Recursiva(ini, x);
    }

    public No buscaLinear2Recursiva(No temp, int x) {
        boolean busca = false;
        if (temp == null || temp.getElements() == x) {
            return temp;
        }
        return buscaLinear2Recursiva(temp.getProx(), x);

    }

    public void insereFinalR(int elemento) {
        insereFinalR2(ini, elemento);

    }

    public void insereFinalR2(No temp, int elemento) {

        if (temp == null) {
            No novo = new No(elemento, ini);
            ini = novo;
        } else {
            if (temp.getProx() == null) {
                No novo = new No(elemento, null);
                temp.setProx(novo);
            } else {
                insereFinalR2(temp.getProx(), elemento);
            }
        }

    }

    public void insereOrdenadoR(int elemento) {
        insereOrdenadoR2(null, ini, elemento);
    }

    public void insereOrdenadoR2(No anterior, No temp, int elemento) {

        if (temp == null) {
            No novo = new No(elemento, null);
            novo.setProx(ini.getProx());
            ini = novo;
        } else {
            No novo = new No(elemento, null);
            if (novo.getElements() < ini.getElements()) {
                novo.setProx(ini.getProx());
                ini = novo;
            } else {

                if (temp.getElements() > novo.getElements()) {
                    novo.setProx(anterior.getProx());
                    anterior.setProx(novo);
                } else {
                    insereOrdenadoR2(temp, temp.getProx(), elemento);
                }
            }
        }
    }

    public void removerInicio() {
        if (!vazia()) {
            ini = ini.getProx();
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public void removerFinal() {
        No temp = ini;
        No anterior = null;

        while (temp.getProx() != null) {
            anterior = temp;
            temp = temp.getProx();
        }
        if (anterior == null) {
            ini = null;
        } else {
            if (temp.getProx() == null) {
                anterior.setProx(null);
            }
        }

    }

    public void removerOrdenado(int elemento) {

        if (vazia()) {
            System.out.println("Lista vazia não é possivel efetuar a remoção");
        } else {

            No temp = ini;
            No anterior = null;

            while (temp != null && temp.getElements() != elemento) {
                anterior = temp;
                temp = temp.getProx();
            }
            if (anterior == null) {
                ini = ini.getProx();
            } else {
                if (temp.getElements() == elemento) {
                    anterior.setProx(temp.getProx());
                }
            }
        }
    }

    public void removerFinalRecursivo() {
        ListaEncadeada.this.removerFinalRecursivo(null, ini);
    }

    public void removerFinalRecursivo(No anterior, No temp) {

        if (vazia()) {
            System.out.println("Lista vazia não é possivel efetuar a remoção");
        } else {
            if (temp.getProx() == null) {
                anterior.setProx(null);
            } else {
                if (anterior == null && temp.getProx() == null) {
                    ini = null;
                } else {
                    removerFinalRecursivo(temp, temp.getProx());
                }

            }
        }
    }

    public void inverterLista() {
        No anterior = null;
        No temp = ini;
        No aux = null;

        while (temp.getProx() != null) {
            aux = anterior;
            anterior = temp;
            temp = temp.getProx();
            anterior.setProx(aux);
        }
        ini = temp;
        ini.setProx(anterior);
    }
}
