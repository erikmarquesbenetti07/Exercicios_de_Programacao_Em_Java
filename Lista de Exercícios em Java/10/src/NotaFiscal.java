/*
  Altere o programa 09 anterior para que a nota fiscal também contenha a forma de
pagamento. Considere que deve ser concedido um desconto de 10% caso a forma
de pagamento seja à vista
*/

public class NotaFiscal {
  Cliente cliente;
   Item item1;
   int quantidade1;
   Item item2;
   int quantidade2;
   Item item3;
   int quantidade3;
   Item item4;
   int quantidade4;
   Item item5;
   int quantidade5;
   double total; 
  char formaDePagamento; // P = A PRAZO \ V = A VISTA

  void exibir() {
    System.out.println("===== NOTA FISCAL =====");
    System.out.println();
    cliente.exibir();
    System.out.println();
    System.out.println("==== ITENS ====");
    exibirItem(item1, quantidade1);
    exibirItem(item2, quantidade2);
    exibirItem(item3, quantidade3);
    exibirItem(item4, quantidade4);
    exibirItem(item5, quantidade5);
    System.out.println("==== TOTAL ====");
    System.out.println("Total: R$" + this.total);
    
    if(formaDePagamento == 'V'){
      System.out.println("Forma de pagamento: a vista");
      this.total = this.total * 0.9;
    }
    else{
      System.out.println("Forma de pagamento: a prazo");
    }
    System.out.println("Total Final: R$" + this.total);

  }

  void exibirItem(Item item, int quantidade){
    if(item != null){
        this.total += item.exibirVenda(quantidade);
    }
}
}
