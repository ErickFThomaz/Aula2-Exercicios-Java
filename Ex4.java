package proa.java.exercicios;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Escolha umas das opçoes: \n" +
                "1- Soma\n" +
                "2- Subtracao\n" +
                "3- Multiplicacao\n" +
                "4- Divisao");
        var choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Digite o primeiro numero: ");
                var n1 = sc.nextInt();

                System.out.println("Digite o segundo número: ");
                var n2 = sc.nextInt();

                System.out.println("A soma dos numeros: " + (n1 + n2));
                break;

            case 2:
                System.out.println("Digite o primeiro número: ");
                var s1 = sc.nextInt();

                System.out.println("Digite o segundo número: ");
                var s2 = sc.nextInt();

                System.out.println("A subtracao dos numeros: " + (s1 - s2));
                break;

            case 3:
                System.out.println("Digite o prineiro numero: ");
                var m1 = sc.nextInt();

                System.out.println("Digite o segubndo numero: ");
                var m2 = sc.nextInt();

                System.out.println("A multipicacao dos numeros: " + (m1 * m2));
                break;

            case 4:
                System.out.println("Digite o primeiro numero: ");
                var d1 = sc.nextInt();

                System.out.println("Digite o segundo numero: ");
                var d2 = sc.nextInt();

                System.out.println("A divisão dos numeros: " + (d1 / d2));
                break;
        }
    }
}
