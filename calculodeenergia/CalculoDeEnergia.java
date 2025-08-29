package calculodeenergia;

import java.util.Scanner;

public class CalculoDeEnergia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumida pela residência: ");
        double consumoQuilowatts = scanner.nextDouble();

        scanner.close();

        double valorPorQuilowatt = salarioMinimo / 500.0;

        double valorTotal = valorPorQuilowatt * consumoQuilowatts;

        double valorComDesconto = valorTotal * 0.85; // 100% - 15% = 85%

        System.out.println("\n--- Resultados do Cálculo ---");
        System.out.printf("A. O valor de cada quilowatt é: R$ %.2f%n", valorPorQuilowatt);
        System.out.printf("B. O valor total a ser pago é: R$ %.2f%n", valorTotal);
        System.out.printf("C. O valor com 15%% de desconto é: R$ %.2f%n", valorComDesconto);
    }

}
