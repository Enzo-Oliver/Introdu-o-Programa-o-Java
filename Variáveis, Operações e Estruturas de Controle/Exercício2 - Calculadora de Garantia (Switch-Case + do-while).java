import java.util.Scanner;

public class CalculadoraGarantia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int codigo;

        do {
            System.out.println("\n1 - Eletronicos | 2 - Vestuario | 3 - Moveis | 0 - Sair");
            System.out.print("Codigo do produto: ");
            codigo = leitor.nextInt();

            int garantiaMeses = 0;

            switch (codigo) {
                case 1:
                    garantiaMeses = 24;
                    break;
                case 2:
                    garantiaMeses = 3;
                    break;
                case 3:
                    garantiaMeses = 12;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Categoria invalida.");
            }

            if (garantiaMeses > 0) {
                System.out.println("Garantia: " + garantiaMeses + " meses.");
            }
        } while (codigo != 0);

        System.out.println("Encerrando...");
        leitor.close();
    }
}