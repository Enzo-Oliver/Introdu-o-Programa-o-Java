import java.util.Scanner;

public class GestaoEstoque {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Nome do item: ");
        String item = leitor.nextLine();

        System.out.print("Quantidade atual em estoque: ");
        int estoque = leitor.nextInt();

        System.out.print("Quantidade de saida: ");
        int saida = leitor.nextInt();

        if (saida > 0 && saida <= estoque) {
            estoque -= saida;
            System.out.println("Venda realizada de " + item + ". Novo saldo: " + estoque);
        } else {
            System.out.println("Estoque insuficiente.");
        }

        leitor.close();
    }
}