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

    double exibirVenda(int quantidade) {
        double total = 0;
        if(this.vender(quantidade)) {
            System.out.println("Produto: " + this.nome);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço Unitário: R$" + this.preco);
            total = quantidade * this.preco;
            System.out.println("Preço Total: R$" + total);
        } else {
            System.out.println("Estoque insuficiente!");
        }
        System.out.println();
        return total;
    }
}
