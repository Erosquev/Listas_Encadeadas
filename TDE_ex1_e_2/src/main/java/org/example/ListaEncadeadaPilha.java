package org.example;


public class ListaEncadeadaPilha {
    private Node Lista;

    public ListaEncadeadaPilha() {
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
        } else {
            Node atual = Lista;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);

        }
    }

//    Devo remover ou mudar todos eles de lugar?
    public void remover(){
        if(Lista == null){
            System.out.println("A lista já está vazia!!\n");
        }else{
            Node atual = Lista;
            while(atual.getProximo().getProximo() != null){
                atual = atual.getProximo();
            }
            System.out.println("valor sendo removido: " + atual.getProximo().getValor());
            atual.setProximo(null);
        }

    }
//    Tem que printar de cima para baixo
    public void imprimir(){
        if(Lista == null){
            System.out.println("A lista está vazia");
        }else{
            Node atual = Lista;
            while(atual != null){
                System.out.println(atual.getValor() + ", ");
                atual = atual.getProximo();
            }
        }
    }
}
