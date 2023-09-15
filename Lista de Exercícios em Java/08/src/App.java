public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto();
        produto1.nome = "Bola Quadrada";
        produto1.preco = 100000;
        produto1.quantidade = 0;

        Produto produto2 = new Produto();
        produto2.nome = "Bola Redonda";
        produto2.preco = 10;
        produto2.quantidade = 10;

        produto2.exibirVenda(5);
    }
}
