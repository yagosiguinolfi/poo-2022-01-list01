package main.java.br.edu.fatecfranca.ex02;

public class TestaCliente {

  public static void main(String[] args) throws Exception {
    Cliente cli1 = new Cliente(1234, 0021, "Fulano", 5000);
    cli1.dadosCliente();
    cli1.realizarDeposito(410);
    cli1.dadosCliente();
    cli1.realizarSaque(2010);
    cli1.dadosCliente();

    Cliente cli2 = new Cliente(1232, 0021, "Beltrano", 2300);
    cli2.dadosCliente();
    cli2.realizarDeposito(1700);
    cli2.dadosCliente();
    cli2.realizarSaque(4500);
    cli2.dadosCliente();
    cli2.realizarSaque(80);
    cli2.dadosCliente();
  }

}
