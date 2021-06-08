package proa.java.exercicios;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
       var n1 = scanner.nextInt();

        System.out.println("Informe o segundo número: ");
        var n2 = scanner.nextInt();

        System.out.println("Informe o terceiro número: ");
        var n3 = scanner.nextInt();

        if(n1 > n2 && n2 > n1){

            System.out.println( String.format("A soma dos dois maiores e %1$s", (n2 + n1)));
        }

         else if (n2 > n1 && n3 > n2){
            System.out.println( String.format("A soma dos dois maiores e %1$s", (n2 + n3)));
        }
         else {
            System.out.println( String.format("A soma dos dois maiores e %1$s", (n1 + n3)));
        }
    }
}
