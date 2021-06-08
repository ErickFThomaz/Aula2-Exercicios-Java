package proa.java.exercicios;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println(new String("Informe o 1º numero:".getBytes(StandardCharsets.UTF_8)));
        var v = sc.nextInt();

        System.out.println(new String("Informe o 2º numero:".getBytes(StandardCharsets.UTF_8)));
        var v2 = sc.nextInt();

        if(v2 > 0 && v > 0){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
    }
}
