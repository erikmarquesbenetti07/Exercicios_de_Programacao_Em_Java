/*
  Altere o programa 09 anterior para que a nota fiscal também contenha a forma de
pagamento. Considere que deve ser concedido um desconto de 10% caso a forma
de pagamento seja à vista.
*/

public class Cliente {
    String nome;
    Endereco endereco; 
    void exibir() {

        System.out.println("===== CLIENTE ====");
        System.out.println("Nome: " + this.nome);
        endereco.exibir();
    }
}
