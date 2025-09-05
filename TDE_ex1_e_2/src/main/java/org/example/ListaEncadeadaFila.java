package org.example;

public class ListaEncadeadaFila {
    private Node Lista;


    public ListaEncadeadaFila(){
        this.Lista = null;
    }

    public Node getLista() {
        return Lista;
    }

    public void setLista(Node lista) {
        Lista = lista;
    }

    public void inserir(int valor) {
        Node novo = new Node();
        novo.setValor(valor);

        if (Lista == null) {
            Lista = novo;
        }else {
            Node atual = Lista;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
        System.out.println("Valor inserido.\n");
    }

//    Devo remover ou mudar todos eles de lugar?
    public void remover(){
        if (Lista == null) {
            System.out.println("A lista já está vazia!!\n");

        }else{
            Node atual = Lista;
            System.out.println("Removendo valor: "+ atual.getValor()+"\n");
            Lista = Lista.getProximo();
        }
    }

    public void imprimir(){
        if (Lista == null) {
            System.out.println("A Lista está vazia!!\n");
        }
        else{
            Node atual = Lista;
            while (atual != null) {
                System.out.print(atual.getValor()+ ", ");
                atual= atual.getProximo();
            }
            System.out.println("null\n");

        }
    }
}
