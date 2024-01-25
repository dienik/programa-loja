/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaloja;

/**
 *
 * @author diene-silva
 */
import java.util.ArrayList;

class Loja {
    private ArrayList<Item> estoque = new ArrayList<>();
    private ArrayList<VendaListener> vendaListeners = new ArrayList<>();
    private ArrayList<CarrinhoListener> carrinhoListeners = new ArrayList<>();
    private ArrayList<Item> carrinho = new ArrayList<>();

    public void adicionarItem(Item item) {
        estoque.add(item);
    }

    public void realizarVenda(Item item) {
        if (estoque.contains(item)) {
            estoque.remove(item);
            notificarVendaListeners(item);
        } else {
            throw new ItemNaoEncontradoException("Item não encontrado no estoque");
        }
    }

    public void addVendaListener(VendaListener listener) {
        vendaListeners.add(listener);
    }

    private void notificarVendaListeners(Item item) {
        for (VendaListener listener : vendaListeners) {
            listener.vendaRealizada(item);
        }
    }

    public void adicionarAoCarrinho(Item item) {
        if (estoque.contains(item)) {
            estoque.remove(item);
            carrinho.add(item);
            notificarVendaListeners(item);
            notificarCarrinhoListeners(item);
        } else {
            throw new ItemNaoEncontradoException("Item não encontrado no estoque");
        }
    }

    public void addCarrinhoListener(CarrinhoListener listener) {
        carrinhoListeners.add(listener);
    }

    private void notificarCarrinhoListeners(Item item) {
        ItemAdicionadoCarrinhoEvent evento = new ItemAdicionadoCarrinhoEvent(item);
        for (CarrinhoListener listener : carrinhoListeners) {
            listener.itemAdicionadoCarrinho(item);
        }
    }
     public void exibirCarrinho() {
        System.out.println("Itens no Carrinho:");
        for (Item item : carrinho) {
            item.exibirDetalhes();
        }
    }

    public ArrayList<Item> getEstoque() {
        return estoque;
    }

    
}

