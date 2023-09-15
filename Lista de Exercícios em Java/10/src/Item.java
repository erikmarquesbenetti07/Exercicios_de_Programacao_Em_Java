/*
  Altere o programa 09 anterior para que a nota fiscal também contenha a forma de
pagamento. Considere que deve ser concedido um desconto de 10% caso a forma
de pagamento seja à vista
*/

public class Item {
        String nome;
        double preco;
        int quantidade;
    
        boolean vender(int quantidade) {
            if(quantidade > this.quantidade){
                return false;
            }
            else{
                this.quantidade = this.quantidade - quantidade;
                return true;
            }
        }
    
        double exibirVenda(int quantidade){
            double total = 0;
            if(this.vender(quantidade)){
                System.out.println("Produto: " + this.nome);
                System.out.println("Quantidade: " + quantidade);
                System.out.println("Pre;o Unitário: R$" + this.preco);
                total = quantidade * this.preco;
                System.out.println("Preco Total: R$" + total);
              }
              else{
                 System.out.println("Estoque insuficiente!");
              }
              System.out.println();
              return total;
        }
    }
