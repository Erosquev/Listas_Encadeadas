package org.example;

public class ListaEncadeadaOrdenada {
    private Node lista;

    public ListaEncadeadaOrdenada() {
        lista = null;
    }

    public Node getLista() {
        return lista;
    }

    public void setLista(Node lista) {
        this.lista = lista;
    }

    public void insereOrdenado(int info) {
        Node novo = new Node();
        novo.setValor(info);

        if (lista == null || info < lista.getValor()) {
            novo.setProximo(lista);
            lista = novo;
        } else{

            Node contador = lista;
            while (contador.getProximo() != null && contador.getProximo().getValor() < info) {
                contador = contador.getProximo();
            }

            novo.setProximo(contador.getProximo());
            contador.setProximo(novo);
        }
    }

    public void imprimir(){
        Node contador = lista;

        while (contador != null){
            System.out.print(contador.getValor() + " -> ");
            contador = contador.getProximo();
        }
    }

    public void merge(ListaEncadeadaOrdenada lista1, ListaEncadeadaOrdenada lista2){
        Node contador1 = new Node();
        contador1.setProximo(lista1.getLista());
        Node contador2 = new Node();
        contador2.setProximo(lista2.getLista());

        while (contador1.getProximo() != null) {
            this.insereOrdenado(contador1.getProximo().getValor());
            contador1 = contador1.getProximo();
        }
        while (contador2.getProximo() != null) {
            this.insereOrdenado(contador2.getProximo().getValor());
            contador2 = contador2.getProximo();
        }
    }

}
