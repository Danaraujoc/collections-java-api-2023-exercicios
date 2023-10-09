package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {

    private List<Item> itemList;

    public CarrinhodeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemsParaRemover.add(i);
                }
            }
            itemList.removeAll(itemsParaRemover);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Lista Vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        }else {
            System.out.println("Lista Vazia!");
        }
    }

   @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                " + itens=" + itemList +
                '}';

    }

    public static void main(String[] args) {
        CarrinhodeCompras carrinhodeCompras = new CarrinhodeCompras();

        carrinhodeCompras.adicionarItem("Arroz", 18.00, 2);
        carrinhodeCompras.adicionarItem("Feijão", 8.00, 1);
        carrinhodeCompras.adicionarItem("Macarrão", 3.50, 3);
        carrinhodeCompras.adicionarItem("Oleo", 5.49, 4);
        carrinhodeCompras.adicionarItem("Açucar", 20.00, 2);

        //Exibindo os itens no carrinho
        carrinhodeCompras.exibirItens();

        //Removendo itens do Carrinho
        carrinhodeCompras.removerItem("Arroz");

        //Carrinho de Compras Atualizado
        carrinhodeCompras.exibirItens();

        carrinhodeCompras.calcularValorTotal();
        System.out.println("Valor total carrinho: " + "R$ " + carrinhodeCompras.calcularValorTotal());





    }
}
