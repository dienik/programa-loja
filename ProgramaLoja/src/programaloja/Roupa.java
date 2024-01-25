/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaloja;

/**
 *
 * @author diene-silva
 */
class Roupa extends Item {
    private String tamanho;

    public Roupa(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome() + ", Preço: " + getPreco() + ", Tamanho: " + tamanho);
    }
}

