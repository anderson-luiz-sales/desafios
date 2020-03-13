package desafios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double consumo, total;

        System.out.println("Informe o consumo de água");
        consumo = sc.nextDouble();

        if (consumo <= 10) {

            total = 26.18;
            System.out.printf("Consumo total: R$ %.2f%n", total);

        } else if (consumo > 10 && consumo <= 20) {

            total = consumo * 4.10;
            System.out.printf("Consumo total: R$ %.2f%n", total);

        } else if (consumo > 20 && consumo <= 30) {

            total = consumo * 10.23;
            System.out.printf("Consumo total: R$ %.2f%n", total);

        } else if (consumo > 30 && consumo <= 50) {

            total = consumo * 10.23;
            System.out.printf("Consumo total: R$ %.2f%n", total);

        } else if (consumo > 50) {

            total = consumo * 11.27;
            System.out.printf("Consumo total: R$ %.2f%n", total);
        }
    }
}