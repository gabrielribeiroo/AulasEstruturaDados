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
public class BatataQuente {

    public static void main(String[] args) throws Exception {
        Fila q = new Fila();
        q.enqueue("Pablo");
        q.enqueue("Bia");
        q.enqueue("Eric");
        q.enqueue("Everton");
        q.enqueue("Marcos");
        System.out.println(q);

        Object vencedor = batataq(q, 7);
        System.out.println(vencedor);
    }

    public static Object batataq(Fila q, int k) throws Exception {
        while (!q.isEmpty()) {
            if (q.tamanho() == 1) {
                return q.dequeue();
            } else {
                for (int i = 0; i < k; i++) {
                    q.enqueue(q.dequeue());
                }
                q.dequeue();
            }
        }
        return q.dequeue();

    }
}
