package desafios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tipo;
        double valor, total;

        System.out.println("Informe o valor do veículo:");
        valor = sc.nextDouble();

        System.out.println();

        System.out.println("Tipo 1: Veículos de carga, tipo caminhão");
        System.out.println("Tipo 2: Ônibus e micro-ônibus");
        System.out.println("Tipo 3: Caminhonetes cabine simples (capacidade até 3 passageiros");
        System.out.println("Tipo 4: Motocicletas, ciclomotores, motonetas, triciclos e quadriciclos");
        System.out.println("Tipo 5: Máquinas de terraplanagem, empilhadeiras, guindastes, locomotivas tratores e similares (ver obs.)");
        System.out.println("Tipo 6: Veículos movidos a álcool, gás natural veicular (GNV) ou eletricidade, exclusivamente ou combinados entre si");
        System.out.println("Tipo 7: Veículos não incluídos nas linhas acima");
        System.out.println();

        System.out.println("Informe o tipo do veículo:");
        tipo = sc.nextInt();

        switch (tipo) {
            case 1:
                total = (valor * 1.5) / 100;
                System.out.printf("O valor do seu IPVA: %.2f%n", total);
                break;
            case 2:
                total = (valor * 2.0) / 100;
                System.out.printf("O valor do seu IPVA: %.2f%n", total);
                break;
            case 3:
                total = (valor * 2.0) / 100;
                System.out.printf("O valor do seu IPVA: %.2f%n", total);
                break;
            case 4:
                total = (valor * 2.0) / 100;
                System.out.printf("O valor do seu IPVA: %.2f%n", total);
                break;
            case 5:
                total = (valor * 2.0) / 100;
                System.out.printf("O valor do seu IPVA: %.2f%n", total);
                break;
            case 6:
                total = (valor * 3.0) / 100;
                System.out.printf("O valor do seu IPVA: %.2f%n", total);
                break;
            case 7:
                total = (valor * 4.0) / 100;
                System.out.printf("O valor do seu IPVA: %.2f%n", total);
                break;
        }
    }
}