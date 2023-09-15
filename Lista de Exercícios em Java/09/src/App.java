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

        NotaFiscal notaFiscal = new NotaFiscal();
        
        notaFiscal.cliente = new Cliente();
        notaFiscal.cliente.nome = "Fulano de Tal";
        notaFiscal.cliente.endereco = new Endereco();
        notaFiscal.cliente.endereco.rua = "Rua dos Bobos";
        notaFiscal.cliente.endereco.numero = 0;
        
        notaFiscal.item1 = produto2;
        notaFiscal.quantidade1 = 1;

        notaFiscal.item2 = produto1;
        notaFiscal.quantidade2 = 1;

        notaFiscal.item3 = produto2;
        notaFiscal.quantidade3 = 2;
        
        notaFiscal.exibir();
    }
}
