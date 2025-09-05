package org.example;

public class VetorOrdenado {
    private int tamanho ;
    private int[] vetor;
    private int capacidade;

    public VetorOrdenado(int tamanho) {
        this.tamanho = tamanho;
        this.vetor = new int[tamanho];
        this.capacidade = 0;
    }

    public void cheio(){
        if(this.tamanho == this.capacidade){
            System.out.println("O vetor ja está cheio!!");
        }
    }

    public void inserirOrdenado(int valor){
        if(this.capacidade == this.tamanho){
            System.out.println("O vetor ja está cheio!!");
        }else {
            int i = 0;
            while (i < capacidade && vetor[i] < valor) {
               i++;
            }
            for (int j = capacidade; j > i; j--) {
                vetor[j] = vetor[j-1];
            }
            vetor[i] = valor;

            this.capacidade++;
        }
    }

    public void merge(VetorOrdenado vetor1, VetorOrdenado vetor2){
        for (int i = 0; i< vetor1.getTamanho(); i++){
            inserirOrdenado(vetor1.getVetor()[i]);
        }
        for (int i = 0; i< vetor2.getTamanho(); i++){
            inserirOrdenado(vetor2.getVetor()[i]);
        }
    }

    public void imprimir(){
        for(int i = 0; i < this.capacidade; i++){
            System.out.println(vetor[i] + ", ");
        }
    }


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
