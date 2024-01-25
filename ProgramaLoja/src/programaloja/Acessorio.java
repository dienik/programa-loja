/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaloja;

/**
 *
 * @author diene-silva
 */
class Acessorio extends Item {
    private String tipo;

    public Acessorio(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome() + ", Preço: " + getPreco() + ", Tipo: " + tipo);
    }
}
