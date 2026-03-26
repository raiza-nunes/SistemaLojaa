package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        CalculadoraService service = new CalculadoraService();
        double total = service.calcularTotal(produto);

        System.out.println("\nProduto: " + produto.nome);
        System.out.println("Total: R$ " + total);

        scanner.close();
    }
}
