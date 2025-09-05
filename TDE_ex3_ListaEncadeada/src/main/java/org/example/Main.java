package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaEncadeadaOrdenada lista_A = new ListaEncadeadaOrdenada();
        ListaEncadeadaOrdenada lista_B = new ListaEncadeadaOrdenada();
        ListaEncadeadaOrdenada lista_C = new ListaEncadeadaOrdenada();

        int opcao = 0;
        int valor;
            while(opcao != 2) {
                System.out.println("O que deseja fazer? \n[1] - Inserir valor na lista A \n[2] - Ir para lista B \n");
                opcao = sc.nextInt();
                if (opcao == 1) {
                    System.out.println("Digite um valor para inserir na lista A: \n");
                    valor = sc.nextInt();
                    lista_A.insereOrdenado(valor);
                } else{

                    System.out.println("Sua lista A ficou assim: \n");
                    lista_A.imprimir();

                    System.out.println("\nOk, agora vamos para a lista B: \n");
                }
            }

            opcao = 0;
            while (opcao != 2) {
                System.out.println("O que deseja fazer? \n[1] - Inserir valor na lista B \n[2] - Ir para lista C \n");
                opcao = sc.nextInt();
                if (opcao == 1) {
                    System.out.println("Digite um valor para inserir na lista B: \n");
                    valor = sc.nextInt();
                    lista_B.insereOrdenado(valor);
                } else {
                    System.out.println("Sua lista B ficou assim: \n");
                    lista_B.imprimir();
                    System.out.println("\nOk, agora vamos juntar a lista A com a B e criar a lista C!! \n");
                }
            }

            lista_C.merge(lista_A, lista_B);
            System.out.println("Sua lista C ficou assim: ");
            lista_C.imprimir();

            System.out.println("\n\nencerrando programa...");
            sc.close();
        }

    }
