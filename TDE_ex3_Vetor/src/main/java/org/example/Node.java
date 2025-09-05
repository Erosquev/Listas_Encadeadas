package org.example;

public class Node {
    private Integer valor;
    private Node proximo;

    public Node() {
        this.valor = null;
        this.proximo = null;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
