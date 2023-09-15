public class NotaFiscal {
    Cliente cliente;
    Produto item1;
    int quantidade1;
    Produto item2;
    int quantidade2;
    Produto item3;
    int quantidade3;
    Produto item4;
    int quantidade4;
    Produto item5;
    int quantidade5;
    double total;

    void exibir() {
        System.out.println("===== NOTA FISCAL =====");
        System.out.println();
        cliente.exibir();
        System.out.println();
        System.out.println("===== ITENS =====");
        exibirItem(item1, quantidade1);
        exibirItem(item2, quantidade2);
        exibirItem(item3, quantidade3);
        exibirItem(item4, quantidade4);
        exibirItem(item5, quantidade5);
        System.out.println("===== TOTAL =====");
        System.out.println("Total: R$" + this.total);
    }

    void exibirItem(Produto item, int quantidade) {
        if(item != null) {
            this.total += item.exibirVenda(quantidade);
        }
    }
}
