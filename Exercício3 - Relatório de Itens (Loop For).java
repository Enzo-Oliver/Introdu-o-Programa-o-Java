import java.util.Scanner;

public class RelatorioItens {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantidade de produtos (N): ");
        int n = leitor.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Preço do produto " + i + ": ");
            soma += leitor.nextDouble();
        }

        if (n > 0) {
            double media = soma / (double) n; // Explicit Casting
            System.out.println("Soma total: " + soma);
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhum produto cadastrado.");
        }

        leitor.close();
    }
}