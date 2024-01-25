/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaloja;

/**
 *
 * @author diene-silva
 */
public class ItemAdicionadoCarrinhoEvent {
        private Item item;

    public ItemAdicionadoCarrinhoEvent(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }
}
