public class Produto {
    String nome;
    double preco;
    int quantidade;

    boolean vender(int quantidade) {
        if(quantidade > this.quantidade) {
            return false;
        } else {
            this.quantidade = this.quantidade - quantidade;
            return true;
        }
    }

    void exibirVenda(int quantidade) {
        if(this.vender(quantidade)) {
            System.out.println("Produto: " + this.nome);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço Unitário: R$" + this.preco);
            System.out.println("Preço Total: R$" + (quantidade * this.preco));
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }
}
