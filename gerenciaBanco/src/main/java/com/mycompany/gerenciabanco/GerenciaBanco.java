/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class GerenciaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cabeçalho do sistema
        System.out.println("****************************************");
        System.out.println("***** Sistema de controle bancário *****");
        System.out.println("****************************************");

        // Solicitar informações do usuário
        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Informe seu CPF: ");
        String cpf = scanner.nextLine();

        // Criar a conta do usuário
        ContaBanco conta = new ContaBanco(nome + " " + sobrenome, cpf);

        // Mostrar menu de transações
        Menu menu = new Menu(conta);
        menu.exibirMenuPrincipal();
    }
}
