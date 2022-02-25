package main.java.br.edu.fatecfranca.ex01;

import javax.swing.JOptionPane;

public class Aluno {
  int numeroAluno;
  String nome;
  int idade;
  float prova1;
  float prova2;

  Aluno() {
  }

  Aluno(
      int numeroAluno,
      String nome,
      int idade,
      float prova1,
      float prova2) {
    this.numeroAluno = numeroAluno;
    this.nome = nome;
    this.idade = idade;
    this.prova1 = prova1;
    this.prova2 = prova2;
  }

  float notafinal() {
    return (this.prova1 + this.prova2) / 2;
  }

  void passou() {
    if (notafinal() >= 6) {
      JOptionPane.showMessageDialog(null, "O aluno " + this.nome + " passou!");
    } else {
      JOptionPane.showMessageDialog(null, "O aluno " + this.nome + " não passou!");
    }
  }

  void dadosAluno() {
    JOptionPane.showMessageDialog(null,
        "Número do aluno: " + this.numeroAluno +
            "\nNome: " + this.nome +
            "\nIdade: " + this.idade);
  }

}
