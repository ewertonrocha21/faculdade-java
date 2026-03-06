package atv3;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite seu salario: ");
        double salario = sc.nextDouble();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
    }
}
