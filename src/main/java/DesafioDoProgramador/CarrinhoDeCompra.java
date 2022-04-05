package DesafioDoProgramador;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CarrinhoDeCompra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] produtos = {"Arroz", "Feijão", "Açucar", "Vinho", "Cereal", "Miojo",
                "Sabão", "Leite", "Oleo", "Azeite"};
        Double[] valorProduto = {23.99, 8.99, 14.99, 99.99, 9.99, 1.99, 2.99, 4.57, 5.99, 12.99};
        Integer[] qtdEstoque = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        ArrayList<Integer> listaCodigoProdutos = new ArrayList<>();
        ArrayList<Integer> listaQtndProd = new ArrayList<>();
        DecimalFormat formatador = new DecimalFormat("#,##0.00");
        String compraNovamente = "s";
        Double valorTotalCompra = 0.0, valorComDesconto = 0.0, imposto = 0.09,
                valorDoDesconto = 0.0, totalComImposto, valorTotalItens;
        while (compraNovamente.equalsIgnoreCase("s")) {
            int codigo = 1;
            int qtdEscolhida = 0;
            System.out.println("=========================================================" +
                    "\n                       Produtos                          " +
                    "\n=========================================================" +
                    "\n\nCÓDIGO\t\tPRODUTO\t\tQTND. PRODUTO\t\tPREÇO UNIT.\n");
            for (int i = 0; i < produtos.length; i++) {
                System.out.println(codigo + "\t \t \t" + produtos[i] + "\t \t \t " +
                        qtdEstoque[i] + "\t \t \t \t" + "R$" + valorProduto[i]);
                codigo++;
            }
            Boolean valido = Boolean.TRUE;
            int codigoProduto = 0;
            while (valido.equals(Boolean.TRUE)) {
                System.out.print("=========================================================" +
                        "\nOlá! Digite o código do produto desajado: ");
                codigoProduto = entrada.nextInt();
                codigoProduto = codigoProduto - 1;
                if (codigoProduto < 10) {
                    System.out.print("Insira a quantidade desejada do produto: ");
                    qtdEscolhida = entrada.nextInt();
                    valido = Boolean.FALSE;
                } else {
                    System.err.println("Código do produto invalido: ");
                }
            }
            if (qtdEstoque[codigoProduto] < qtdEscolhida) {
                System.err.println("Quantidade de produtos indisponivel\n");
            } else {
                qtdEstoque[codigoProduto] = qtdEstoque[codigoProduto] - qtdEscolhida;
                listaQtndProd.add(qtdEscolhida);
                listaCodigoProdutos.add(codigoProduto);
            }
            System.out.print("Deseja continuar a sua compra? [S/N] ");
            compraNovamente = entrada.next();
            if (compraNovamente.equalsIgnoreCase("n")) {
                System.out.println("========================================================================================" +
                        "\n================================ ITENS NO CARRINHO =====================================" +
                        "\n========================================================================================" +
                        "\nProduto \t   Qtde. no carrinho \t  Preço unit.(R$) \t  Preço Total (R$) ");
                for (int i = 0; i < listaCodigoProdutos.size(); i++) {
                    valorTotalItens = valorProduto[listaCodigoProdutos.get(i)] * listaQtndProd.get(i);
                    System.out.println(produtos[listaCodigoProdutos.get(i)] + " \t \t \t \t " + listaQtndProd.get(i) +
                            "  \t \t \t \t \t " + valorProduto[listaCodigoProdutos.get(i)] + " \t \t \t\t" + formatador.format(valorTotalItens));
                    valorTotalCompra = valorTotalCompra + valorTotalItens;
                }
                totalComImposto = valorTotalCompra * imposto + valorTotalCompra;
                Boolean formaPagamento = true;
                System.out.println("\nImposto de: \t\t\t\t\t\t\t\t\t\t\t\t\t 9%" +
                        "\nValor total da compra: \t\t\t\t\t\t\t\t\t\t\t" + formatador.format(totalComImposto));
                while (formaPagamento.equals(Boolean.TRUE)) {
                    System.out.println("\nOpções de Pagamento: \n \t[1]À vista (dinheiro, pix ou cartão MasterdCard) tem 20% de desconto." +
                            "\n \t[2]À vista no crédito tem 10% de desconto." +
                            "\n \t[3]Parcelado em até 3x não tem desconto;" +
                            "\n\nQual seria a forma de pagamento? ");
                    int opcao = entrada.nextInt();
                    switch (opcao) {
                        case 1:
                            valorDoDesconto = valorTotalCompra * 0.20;
                            valorComDesconto = totalComImposto - valorDoDesconto;
                            formaPagamento = Boolean.FALSE;
                            break;
                        case 2:
                            valorDoDesconto = valorTotalCompra * 0.10;
                            valorComDesconto = totalComImposto - valorDoDesconto;
                            formaPagamento = Boolean.FALSE;
                            break;
                        case 3:
                            valorComDesconto = totalComImposto;
                            formaPagamento = Boolean.FALSE;
                            break;
                        default:
                            System.err.println("Opção Invalida. ");
                            break;
                    }
                }
                System.out.println("\n\nWIPRO STORE \nRua da paz, N° 570 - Mercadinho  \nCNPJ: 123456548-00" +
                        "\n========================================================================================" +
                        "\n=================================== NOTA FISCAL ========================================" +
                        "\n========================================================================================" +
                        "\n\nProduto \t   Qtde. no carrinho \t  Preço unit.(R$) \t  Preço Total (R$) ");
                for (int i = 0; i < listaCodigoProdutos.size(); i++) {
                    valorTotalItens = valorProduto[listaCodigoProdutos.get(i)] * listaQtndProd.get(i);
                    System.out.println(produtos[listaCodigoProdutos.get(i)] + " \t \t \t \t " + listaQtndProd.get(i) +
                            "  \t \t \t \t \t " + valorProduto[listaCodigoProdutos.get(i)] + " \t \t \t\t" + formatador.format(valorTotalItens));
                }
                System.out.println("----------------------------------------------------------------------------------------" +
                        "\nImposto de: \t\t\t\t\t\t\t\t\t\t\t\t\t 9%" +
                        "\nValor tributário: \t\t\t\t\t\t\t\t\t\t\t\t" + (formatador.format(valorTotalCompra * imposto)) +
                        "\nValor total da compra: \t\t\t\t\t\t\t\t\t\t\t" + (formatador.format(totalComImposto)) +
                        "\nDesconto na compra:\t\t\t\t\t\t\t\t\t\t\t\t" + (formatador.format(valorDoDesconto)) +
                        "\nValor total a ser pago: \t\t\t\t\t\t\t\t\t\t" + (formatador.format(valorComDesconto)) +
                        "\n========================================================================================");
                entrada.close();
                break;
            }
        }
    }
}
