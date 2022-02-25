package main.java.br.edu.fatecfranca.ex00;

import javax.swing.JOptionPane;

public class TestaCarro {
  public static void main(String[] args) throws Exception {

    System.out.println("Hoje é sexta-feira");

    // cria um objeto da classe Carro
    Carro obj1 = new Carro();
    obj1.modelo = JOptionPane.showInputDialog("Informe modelo");
    obj1.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe ano"));
    obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Informe vel"));
    int resp = JOptionPane.showConfirmDialog(null, "Criar o carro com motor ligado?", "Ligar motor?", 0);
    obj1.motor = (resp == JOptionPane.OK_OPTION);

    obj1.mostrar();
    obj1.ligar();
    obj1.mostrar();
    obj1.acelerar(80);
    obj1.mostrar();
    obj1.frear(20);
    obj1.mostrar();
    obj1.desligar();
    obj1.mostrar();

    Carro obj2 = new Carro("Palio", 2012, 0, false);
    obj2.mostrar();

  }
}
