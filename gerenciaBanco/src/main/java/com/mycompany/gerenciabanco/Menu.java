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
public class Menu {
    private final Scanner scanner;
    private final ContaBanco conta;

    public Menu(ContaBanco conta) {
        this.conta = conta;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("\nVocê deseja realizar que tipo de transação:");
            System.out.println("a) Transações comuns:");
            System.out.println("b) Investimentos:");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'a':
                    OperacoesBancarias operacoes = new OperacoesBancarias(conta);
                    operacoes.exibirMenuOperacoes();
                    break;
                case 'b':
                    Investimentos investimentos = new Investimentos(conta);
                    investimentos.exibirMenuInvestimentos();
                    break;
                case '0':
                    System.out.println("Obrigado por usar o Gerencia Banco! Até mais.");
                    return; // Encerra o loop e o programa
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (true); // Loop infinito até que o usuário escolha sair ('0')
    }
    
}
