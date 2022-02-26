package main.java.br.edu.fatecfranca.ex04;

public class TestaRio {

  public static void main(String[] args) throws Exception{

    Rio rio1 = new Rio();
    rio1.nome = "Rio Negro";
    rio1.nivel = 6.2f;
    rio1.poluido = true;

    rio1.chover(0.8f);
    rio1.ensolarar(0.3f);
    rio1.sujar();
    rio1.mostra();

    Rio rio2 = new Rio("Rio Amazonas", 38.7f, false);

    rio2.chover(0.2f);
    rio2.ensolarar(0.4f);
    rio2.limpar();
    rio2.mostra();

  }
  
}
