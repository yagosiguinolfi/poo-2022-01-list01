package main.java.br.edu.fatecfranca.ex03;

public class TestaProduto {

  public static void main(String[] args) throws Exception {

    Produto prod1 = new Produto(1, "Shampoo", 40, 45.49f);

    prod1.subir(5.5f);
    prod1.vender(8);
    prod1.comprar(40);
    prod1.descer(10.0f);

    prod1.mostra();

  }
}
