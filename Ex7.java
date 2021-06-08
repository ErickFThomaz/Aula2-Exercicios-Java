package proa.java.exercicios;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int finalV = 0;

        for(int i = 1; i <= 10; i++){
            String text = new String(String.format("Informe o %1$sº numero:", i).getBytes(StandardCharsets.UTF_8));
            System.out.println(text);
            var valor = sc.nextInt();

            if(valor < 40) {
                finalV = valor + finalV;
            }
        }
        String text = new String(String.format("A soma dos 10 números inferiores a 40 é: %1$s", finalV).getBytes(StandardCharsets.UTF_8));
        System.out.println(text);
    }
}
