/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaloja;

import java.util.Scanner;

/**
 *
 * @author diene-silva
 */
public class ProgramaLoja {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {

        Loja minhaLoja = new Loja();

        minhaLoja.adicionarItem(new Roupa("Camiseta", 29.99, "M"));
        minhaLoja.adicionarItem(new Acessorio("Boné", 15.99, "Esportivo"));
        minhaLoja.adicionarItem(new Chapeu("Chapéu de Verão", 19.99, "Fashion", "Palha"));

        minhaLoja.addVendaListener(item -> System.out.println("Venda realizada: " + item.getNome()));
        minhaLoja.addCarrinhoListener(item -> System.out.println("Item adicionado ao carrinho: " + item.getNome()));

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu de Venda ---");
            System.out.println("1. Adicionar item ao carrinho");
            System.out.println("2. Renovar carrinho");
            System.out.println("3. Visualizar estoque");
            System.out.println("4. Visualizar carrinho");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Estoque disponível:");
                    exibirEstoque(minhaLoja);
                    System.out.print("Digite o nome do item para adicionar ao carrinho: ");
                    scanner.nextLine(); // Limpar o buffer
                    String nomeItem = scanner.nextLine();
                    adicionarAoCarrinho(minhaLoja, nomeItem);
                    break;
                case 2:
                    renovarCarrinho(minhaLoja);
                    break;
                case 3:
                    System.out.println("Estoque atual:");
                    exibirEstoque(minhaLoja);
                    break;
                case 4:
                    System.out.println("Carrinho atual:");
                    exibirCarrinho(minhaLoja);
                    break;
                case 0:
                    System.out.println("Saindo do menu de venda. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private static void adicionarAoCarrinho(Loja loja, String nomeItem) {
        for (Item item : loja.getEstoque()) {
            if (item.getNome().equalsIgnoreCase(nomeItem)) {
                loja.adicionarAoCarrinho(item);
                return;
            }
        }
        System.out.println("Item não encontrado no estoque.");
    }

    private static void renovarCarrinho(Loja loja) {
        System.out.println("Carrinho renovado.");
    }

    private static void exibirEstoque(Loja loja) {
        for (Item item : loja.getEstoque()) {
            item.exibirDetalhes();
        }
    }

    private static void exibirCarrinho(Loja loja) {
        loja.exibirCarrinho();
    }
}
}
