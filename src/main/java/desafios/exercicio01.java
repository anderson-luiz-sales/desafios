package desafios;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cm, dp,tv, vm, qtlc;

        System.out.println("Informe o consumo médio:");
        cm = sc.nextDouble();

        System.out.println("Informe a distância percorrida:");
        dp = sc.nextDouble();

        System.out.println("Informe o tempo de viagem:");
        tv = sc.nextDouble();

        vm = dp / tv;
        qtlc = dp / cm;

        System.out.printf("Quantidade de litros de combustível: %.2f", qtlc);
        System.out.println();
        System.out.printf("Velocidade média: %.2f", vm);
    }
}