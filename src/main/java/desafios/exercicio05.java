package desafios;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura, peso, imc;

        System.out.println("Informe a altura do usuário:");
        altura = sc.nextDouble();

        System.out.println("Informe o peso do usuário:");
        peso = sc.nextDouble();

        imc = peso / Math.pow(altura, 2);
        System.out.println();

        if (imc < 18.5) {

            System.out.printf("IMC %.2f", imc);
            System.out.println();
            System.out.println("Adulto com baixo peso");

        } else if (imc >= 18.5 && imc < 25.0) {

            System.out.printf("IMC %.2f", imc);
            System.out.println();
            System.out.println("Adulto com peso adequado (eutrópico)");

        } else if (imc >= 25.0 && imc < 30.0) {

            System.out.printf("IMC %.2f", imc);
            System.out.println();
            System.out.println("Adulto com sobrepeso");

        } else if (imc >= 30 && imc < 30.0) {

            System.out.printf("IMC %.2f", imc);
            System.out.println();
            System.out.println("Adulto com obesidade");

        } else if (imc >= 35.0 && imc <= 39.0) {

            System.out.printf("IMC %.2f", imc);
            System.out.println();
            System.out.println("Obesidade severa");

        } else if (imc > 40) {

            System.out.printf("IMC %.2f", imc);
            System.out.println();
            System.out.println("Obesidade III (mórbida)");
        }
    }
}