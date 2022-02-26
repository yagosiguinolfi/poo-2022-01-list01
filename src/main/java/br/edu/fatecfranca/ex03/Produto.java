package main.java.br.edu.fatecfranca.ex03;

import javax.swing.JOptionPane;

public class Produto {
  int id;
  String descricao;
  int qtde;
  float preco;

  Produto() {
  }

  Produto(int id,
      String descricao,
      int qtde,
      float preco) {
    this.id = id;
    this.descricao = descricao;
    this.qtde = qtde;
    this.preco = preco;
  }

  void comprar(int un) {
    this.qtde += un;
  }

  void vender(int un) {
    this.qtde -= un;
  }

  void subir(float valor) {
    this.preco += valor;
  }

  void descer(float valor) {
    this.preco -= valor;
  }

  void mostra() {
    JOptionPane.showMessageDialog(null,
        "Id: " + this.id +
            "\nDescrição: " + this.descricao +
            "\nQuantidade: " + this.qtde +
            "\nPreço: " + this.preco);
  }

}
