/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class OperacoesBancarias {
    
    private final ContaBanco conta;
    private Scanner scanner;

    public OperacoesBancarias(ContaBanco conta) {
        this.conta = conta;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenuOperacoes() {
        int opcao;
        do {
            System.out.println("\nOperações Bancárias:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarDeposito();
                    break;
                case 2:
                    realizarSaque();
                    break;
                case 3:
                    mostrarSaldo();
                    break;
                case 0:
                    return; // Retorna ao menu principal
                default:
                    System.out.println("Opção inválida.");
            }
        } while (true); // Mantém o usuário no menu de operações bancárias até que escolha sair
    }

    private void realizarDeposito() {
        System.out.print("Informe o valor a depositar: ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);
        System.out.println("Depósito realizado com sucesso!");
    }

    private void realizarSaque() {
        System.out.print("Informe o valor a sacar: ");
        double valor = scanner.nextDouble();
        conta.sacar(valor);
    }

    private void mostrarSaldo() {
        System.out.printf("Saldo atual: R$%.2f\n", conta.consultarSaldo());
    }
    
}
