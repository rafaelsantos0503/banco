/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

/**
 *
 * @author rafae
 */
public class ContaBanco {
    private double saldo;
    private String nomeTitular;
    private String cpf;

    public ContaBanco(String nome, String cpf) {
        this.nomeTitular = nome;
        this.cpf = cpf;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
    
}
