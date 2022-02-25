package main.java.br.edu.fatecfranca.ex02;

import javax.swing.JOptionPane;

public class Cliente {
  int numeroConta;
  int numeroAgencia;
  String nome;
  float saldo;

  Cliente() {
  }

  Cliente(int numeroConta,
      int numeroAgencia,
      String nome,
      float saldo) {
    this.numeroConta = numeroConta;
    this.numeroAgencia = numeroAgencia;
    this.nome = nome;
    this.saldo = saldo;
  }

  public void realizarDeposito(float valor) {
    this.saldo = +valor;
    JOptionPane.showMessageDialog(null, "Novo saldo: " + this.saldo);
  }

  public void realizarSaque(float valor) {
    if (this.saldo >= valor) {
      this.saldo = -valor;
      JOptionPane.showMessageDialog(null,
          "Saldo anterior saldo: " + (this.saldo + valor) +
              "\nValor sacado: " + valor +
              "\nSaldo atual: " + this.saldo);
    } else {
      JOptionPane.showMessageDialog(null, "Não há saldo suficiente para esta operação!", "Erro", 0);
    }
  }

  public void dadosCliente() {
    JOptionPane.showMessageDialog(null,
        "Numero da conta: " + this.numeroConta +
            "\nNome do cliente: " + this.nome +
            "\nSaldo atual: " + this.saldo

    );
  }

}