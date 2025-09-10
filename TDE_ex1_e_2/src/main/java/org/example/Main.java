package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;

        System.out.println("Qual tipo de lista encadeada deseja criar? \n[1] - Pilha\n[2] - Fila\n");
        escolha = sc.nextInt();
        if(escolha == 1) {
            System.out.println("Você escolheu PILHA!\n");
            ListaEncadeadaPilha pilha = new ListaEncadeadaPilha();

            while(escolha != 0){
                System.out.println("O que deseja fazer? \n[1] - Inserir valor\n[2] - Remover valor\n[3] - Imprimir pilha\n[0] - Sair\n");
                escolha = sc.nextInt();
                if(escolha == 1) {
                System.out.println("Digite um valor para inserir na pilha: \n");
                int valor = sc.nextInt();
                pilha.inserir(valor);
                    System.out.println("Valor inserido\n");
                }
                else if(escolha == 2) {
                    pilha.remover();
                }
                else if(escolha == 3) {
                    System.out.println("Imprimindo pilha: \n");
                    pilha.imprimir();
                    System.out.println("\n");
                }
            }
        }else if(escolha == 2) {
            System.out.println("Você escolheu FILA!\n");
            ListaEncadeadaFila fila = new ListaEncadeadaFila();

            while(escolha != 0){
                System.out.println("O que deseja fazer? \n[1] - Inserir valor\n[2] - Remover valor\n[3] - Imprimir fila\n[0] - Sair\n");
                escolha = sc.nextInt();
                if(escolha == 1) {
                    System.out.println("Qual valor deseja inserir? \n");
                    int valor = sc.nextInt();
                    fila.inserir(valor);

                }else if(escolha == 2) {
                    fila.remover();

                }else if(escolha == 3) {
                    System.out.println("Imprimindo fila: \n");
                    fila.imprimir();
                }
            }
        }

        System.out.println("Saindo do sistema.");
        sc.close();

    }
}