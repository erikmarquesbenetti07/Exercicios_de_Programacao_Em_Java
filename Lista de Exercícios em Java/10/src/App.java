/*
Altere o programa 09 anterior para que a nota fiscal também contenha a forma de
pagamento. Considere que deve ser concedido um desconto de 10% caso a forma
de pagamento seja à vista
*/

public class App {
    public static void main(String[] args) throws Exception {
      Item item1 = new Item();
      item1.nome = "Bola Quadrada";
      item1.preco = 1000;
      item1.quantidade = 0;

      Item item2 = new Item();
      item2.nome = "Bola redonda";
      item2.preco = 10;
      item2.quantidade = 10;

      NotaFiscal notaFiscal = new NotaFiscal();
      notaFiscal.cliente = new Cliente();
      notaFiscal.cliente.nome = "Marques";
      notaFiscal.cliente.endereco = new Endereco();
      notaFiscal.cliente.endereco.rua = "Rua Unisalesiano";
      notaFiscal.cliente.endereco.numero = 765;

      notaFiscal.item1 = item2;
      notaFiscal.quantidade1 = 1;

      notaFiscal.item3 = item2;
      notaFiscal.quantidade3 = 2;

      notaFiscal.formaDePagamento = 'V';

      notaFiscal.exibir();
    }

}
