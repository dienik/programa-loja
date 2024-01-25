O fluxo de uma venda no programa:

1. **Chamada ao método `realizarVenda(Item item)`**:
   - Quando é desejada a venda de um item, o método `realizarVenda` é chamado com o item que se deseja vender.

2. **Verificação do item no estoque**:
   - O método verifica se o item está presente no estoque da loja usando `estoque.contains(item)`.

3. **Venda bem-sucedida**:
   - Se o item estiver no estoque, ele é removido do estoque (`estoque.remove(item)`).
   - Os ouvintes de venda (`VendaListener`) são notificados sobre a venda bem-sucedida usando o método `notificarVendaListeners(item)`.

4. **Notificação dos ouvintes de venda**:
   - O método `notificarVendaListeners(Item item)` itera sobre a lista de ouvintes de venda e chama o método `vendaRealizada(item)` para cada um deles.

Portanto, quando uma venda é realizada, o item é removido do estoque e os ouvintes de venda são notificados sobre a venda bem-sucedida. Vale notar que o código também tem um método `adicionarAoCarrinho(Item item)` que, além de remover o item do estoque, também adiciona o item ao carrinho e notifica os ouvintes de carrinho (`CarrinhoListener`).
