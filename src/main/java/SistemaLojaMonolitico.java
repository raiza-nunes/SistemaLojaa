import java.util.Scanner;

public class SistemaLojaMonolitico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        double total = preco * quantidade;

        if (quantidade > 10) {
            total *= 0.9;
        }

        System.out.println("\nProduto: " + nome);
        System.out.println("Total: R$ " + total);

        scanner.close();
    }
}
