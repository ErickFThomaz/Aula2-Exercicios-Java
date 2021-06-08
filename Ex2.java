package proa.java.exercicios;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        var n1 = scanner.nextInt();

        System.out.println("Informe o segundo número: ");
        var n2 = scanner.nextInt();

        System.out.println("Informe o terceiro número: ");
        var n3 = scanner.nextInt();

        int v1 = Math.max(n1 , n2);

        int vfinal = Math.max(v1 , n3);

        System.out.println(String.format("O número maior: %s", vfinal));
    }
}
