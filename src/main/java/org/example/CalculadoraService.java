package org.example;

public class CalculadoraService {

    public double calcularTotal(Produto produto) {
        double total = produto.preco * produto.quantidade;

        if (produto.quantidade > 10) {
            total *= 0.9;
        }

        return total;
    }
}
