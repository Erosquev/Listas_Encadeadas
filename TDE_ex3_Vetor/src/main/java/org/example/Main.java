package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual tamanho deseja que os vetores A e B tenham? \n");
        int tamanho = sc.nextInt();
        System.out.println("Criando os vetores. . . \n");
        VetorOrdenado vetorA = new VetorOrdenado(tamanho);
        VetorOrdenado vetorB = new VetorOrdenado(tamanho);
        VetorOrdenado vetorC = new VetorOrdenado(tamanho*2);


        System.out.println("\nVetores criados.\n");



        int opcao = 0;
        int valor;
            while(opcao != 2) {
                System.out.println("O que deseja fazer? \n[1] - Inserir valor no vetor A \n[2] - Ir para vetor B \n");
                opcao = sc.nextInt();
                if(opcao == 1){
                    if(vetorA.getCapacidade() == vetorA.getTamanho()){
                        System.out.println("O vetor ja está cheio!!");
                    } else {
                        System.out.println("Digite o valor que deseja inserir no vetor A: \n");
                        valor = sc.nextInt();
                        vetorA.inserirOrdenado(valor);
                        vetorA.imprimir();
                    }

                }else if(opcao == 2){
                    System.out.println("Agora vamos para o vetor B: \n: ");
                }
            }
            opcao = 0;
            while (opcao != 2) {
                System.out.println("O que deseja fazer?\n[1] - Inserir valor no vetor B \n[2] - Ir para vetor C \n");
                opcao = sc.nextInt();
                if(opcao == 1){
                    if(vetorB.getCapacidade() == vetorB.getTamanho()){
                        System.out.println("O vetor ja está cheio!!");
                    } else {
                        System.out.println("Digite o valor que deseja inserir no vetor B: \n");
                        valor = sc.nextInt();
                        vetorB.inserirOrdenado(valor);
                        vetorB.imprimir();
                    }
                } else if (opcao == 2) {
                    System.out.println("Agora vamos para o vetor C: \n ");
                }
            }

            System.out.println("Preenchendo o vetor C: \n");
            vetorC.merge(vetorA, vetorB);
            vetorC.imprimir();


            }



    }
