package main.java.br.edu.fatecfranca.ex01;

import javax.swing.JOptionPane;

public class TestaAluno {
  public static void main(String[] args) throws Exception{

    Aluno obj1 = new Aluno(1, "Estrobilobaldo", 20, 8, 7);

    obj1.dadosAluno();
    JOptionPane.showMessageDialog(null, "Nota final " + obj1.notafinal());
    obj1.passou();    

  }
  
}
