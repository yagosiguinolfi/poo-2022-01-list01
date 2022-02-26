package main.java.br.edu.fatecfranca.ex04;

import javax.swing.JOptionPane;

public class Rio {
  String nome;
  float nivel;
  boolean poluido;

  Rio() {
  }

  Rio(String nome,
      float nivel,
      boolean poluido) {
    this.nome = nome;
    this.nivel = nivel;
    this.poluido = poluido;
  }

  void chover(float vol){ this.nivel += vol;}
  void ensolarar(float vol){ this.nivel -= vol;}
  void limpar(){ this.poluido = false;}
  void sujar(){ this.poluido = true;}
  void mostra(){
    JOptionPane.showMessageDialog(null,
    "Nome: " + this.nome +
    "\nNível: " + this.nivel +
    "\nPoluído: " + (this.poluido ? "Sim" : "Não")
    );
  }
}
