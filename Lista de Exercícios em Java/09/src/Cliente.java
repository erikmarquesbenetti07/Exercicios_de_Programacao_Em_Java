public class Cliente {
    String nome;
    Endereco endereco;

    void exibir() {
        System.out.println("===== CLIENTE =====");
        System.out.println("Nome: " + this.nome);
        endereco.exibir();
    }
}
