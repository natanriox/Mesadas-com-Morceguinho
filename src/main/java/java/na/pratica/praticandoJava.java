package java.na.pratica;

import java.util.Scanner;

public class praticandoJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        System.out.println("=== Mesada do Morceguinho ===\n" +
                "─────▄───▄\n" +
                "─▄█▄─█▀█▀█─▄█▄\n" +
                "▀▀████▄█▄████▀▀\n" +
                "─────▀█▀█▀\n");

        System.out.print("Quanto você ganha de mesada? ");
        double mesada = scanner.nextDouble();
        System.out.println("\nAqui vai as melhores opções para seus " + mesada + " Reais ↓");
        System.out.println(
                "\n1. Comprar produto do carrinho (1x Livro Entendendo Algoritmos R$ 60,00)" +
                        "\n2. Adicionar mais produtos ao carrinho" +
                        "\n3. Satisfeito, fechar programa.");
        do {
            System.out.print("\nO que deseja fazer com o seu dinheiro? ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    int compra = 60;
                    System.out.println("\nProcessando pagamento no valor de " + compra + " Reais...");
                    if (mesada < compra) {
                        System.out.println("Não foi possível comprar no valor de " + compra + ". Saldo insuficiente.");
                    } else {
                        System.out.println("\nCompra realizada com sucesso no valor de " + compra + " Reais.");
                        mesada -= compra;
                        String.format("%.2f", mesada);
                    }
                    break;
                case 2:
                    String carrinho = "| (443821) Mouse Logitech GPRO Superlight 2 R$ 499,99 || (899217) Teclado Aula F75 75% R$ 399,99 |";
                    System.out.println("Produtos disponíveis para adicionaro ao carrinho ↓\n" + carrinho);
                    System.out.print("\nID do produto que voce deseja adicionar? ");
                    int produtoCarrinho = scanner.nextInt();
                    if (produtoCarrinho == 443821 || produtoCarrinho == 899217) {
                        System.out.println("\nProduto adicionado com sucesso ao carrinho.");
                    } else {
                        System.out.println("Não encontramos o ID " + produtoCarrinho + ", Por favor digite um ID válido.");
                    }
                    break;
                case 3:
                    System.out.println("OBRIGADO POR GERIR SUA MESADA COM O MORCEGUINHO ◠‿◠\n" +
                            "─────▄───▄\n" +
                            "─▄█▄─█▀█▀█─▄█▄\n" +
                            "▀▀████▄█▄████▀▀\n" +
                            "─────▀█▀█▀\n");
                    break;
                default:
                    System.out.println("Escolha uma opção válida (1-3)");
                    break;
            }
        } while (opcao != 3);
        }
    }
