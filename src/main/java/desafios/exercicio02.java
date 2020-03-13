package desafios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, n4, media;

        System.out.println("Informe a nota n1:");
        n1 = sc.nextDouble();

        System.out.println("Informe a nota n2:");
        n2 = sc.nextDouble();

        System.out.println("Informe a nota n3:");
        n3 = sc.nextDouble();

        System.out.println("Informe a nota n4:");
        n4 = sc.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        if (media <= 4) {

            System.out.printf("Media: %.2f%n", media);
            System.out.println("Aluno reprovado");

        } else if (media > 4 && media < 6) {

            System.out.printf("Media: %.2f%n", media);
            System.out.println("Aluno recuperção");

        } else if (media >= 6 && media <= 10) {

            System.out.printf("Media: %.2f%n", media);
            System.out.println("Aluno aprovado");
        }
    }
}