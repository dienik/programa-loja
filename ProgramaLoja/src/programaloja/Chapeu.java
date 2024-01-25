/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaloja;

/**
 *
 * @author diene-silva
 */
class Chapeu extends Acessorio {
    private String material;

    public Chapeu(String nome, double preco, String tipo, String material) {
        super(nome, preco, tipo);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome() + ", Preço: " + getPreco() + ", Tipo: " + getTipo() + ", Material: " + material);
    }
}
