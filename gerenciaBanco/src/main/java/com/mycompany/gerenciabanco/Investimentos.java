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
public class Investimentos {
    private final ContaBanco conta;
    private Scanner scanner;

    public Investimentos(ContaBanco conta) {
        this.conta = conta;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenuInvestimentos() {
        int opcao;
        do {
            System.out.println("\nMenu de Investimentos:");
            System.out.println("1 - Investir em CDB");
            System.out.println("2 - Investir em LCI");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    investirEmCDB();
                    break;
                case 2:
                    investirEmLCI();
                    break;
                case 0:
                    return; // Retorna ao menu principal
                default:
                    System.out.println("Opção inválida.");
            }
        } while (true); // Mantém o usuário no menu de investimentos até que escolha sair
    }

    private void investirEmCDB() {
        System.out.print("Informe o valor a investir em CDB: ");
        double valor = scanner.nextDouble();
        if (valor <= conta.consultarSaldo()) {
            conta.sacar(valor); // Assume que o valor é bloqueado/reservado para o investimento
            // Suponha um rendimento anual de 10%
            double rendimento = valor * 0.10;
            System.out.printf("Investimento de R$%.2f em CDB realizado com sucesso. Rendimento esperado em um ano: R$%.2f\n", valor, rendimento);
        } else {
            System.out.println("Saldo insuficiente para realizar o investimento.");
        }
    }

    private void investirEmLCI() {
        System.out.print("Informe o valor a investir em LCI: ");
        double valor = scanner.nextDouble();
        if (valor <= conta.consultarSaldo()) {
            conta.sacar(valor); // Assume que o valor é bloqueado/reservado para o investimento
            // Suponha um rendimento anual de 8%
            double rendimento = valor * 0.08;
            System.out.printf("Investimento de R$%.2f em LCI realizado com sucesso. Rendimento esperado em um ano: R$%.2f\n", valor, rendimento);
        } else {
            System.out.println("Saldo insuficiente para realizar o investimento.");
        }
    }
}
