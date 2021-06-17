package proa.java.exercicios;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao cinema!");

        System.out.println("Informe seu nome:");
        String name = sc.next();



        System.out.println(name + ", escolha o filme desejado: \n" +
                "1. As Branquelas\n" +
                "2. A Chegada");
        int filme = sc.nextInt();

        switch (filme) {
            case 1:
                int assentosPreferecial = 12;
                int assentos = 24;

                System.out.println(fixUtf8("Você gostaria de assenons preferenciais?"));
                String is = sc.next();
                if (is.equalsIgnoreCase("sim")) {
                    System.out.println(fixUtf8("Estão disponiveis 12 assentos preferenciais. \n" +
                            "Digite quantos assentos você ira querer"));
                    int assentosP = sc.nextInt();

                    if (assentosP > assentosPreferecial) {
                        System.out.println("O valor de assentos escolhidos ultrapassa os assentos disponiveis.");
                        return;
                    }

                    assentosPreferecial -= assentosP;
                    System.out.println(String.format(fixUtf8("%1$s , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme."), name));
                    System.out.println(String.format("Seu(s) assentos ficam na fileira %1$s, seus assentos comprados foram %2$s", "PDC", assentosPreferecial));
                } else {
                    System.out.println("Escolha a fileira desejada(A, B, D, E, F):");
                    String fileira = sc.next();

                    System.out.println("Escolha a cadeira desejada(24 cadeiras disponiveis por fileira):");
                    int cadeira = sc.nextInt();

                    if (cadeira > assentos) {
                        System.out.println("O valor de assentos escolhidos ultrapassa os assentos disponiveis.");
                        return;
                    }

                    assentos -= cadeira;
                    System.out.println(String.format(fixUtf8("%1$s , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme."), name));
                    System.out.println(String.format("Seu(s) assentos ficam na fileira %1$s, seus assentos comprados foram %2$s", fileira, assentos));
                }
                break;

            case 2:
                int assentosPreferecialB = 6;
                int assentosB = 24;

                System.out.println(fixUtf8("Você gostaria de assenons preferenciais?"));
                String are = sc.next();
                if (are.equalsIgnoreCase("sim")) {
                    System.out.println(fixUtf8("Estão disponiveis 6 assentos preferenciais. \n" +
                            "Digite quantos assentos você ira querer"));
                    int assentosP = sc.nextInt();

                    if (assentosP > assentosPreferecialB) {
                        System.out.println("O valor de assentos escolhidos ultrapassa os assentos disponiveis.");
                        return;
                    }

                    assentosPreferecialB -= assentosP;
                    System.out.println(String.format(fixUtf8("%1$s , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme."), name));
                    System.out.println(String.format("Seu(s) assentos ficam na fileira %1$s, seus assentos comprados foram %2$s", "PDC", assentosPreferecialB));
                } else {
                    System.out.println("Escolha a fileira desejada(A, B, D, E):");
                    String fileiraB = sc.next();

                    System.out.println("Escolha a cadeira desejada(24 cadeiras disponiveis por fileira):");
                    int cadeira = sc.nextInt();

                    if (cadeira > assentosB) {
                        System.out.println("O valor de assentos escolhidos ultrapassa os assentos disponiveis.");
                        return;
                    }
                    assentosB -= cadeira;
                    System.out.println(String.format(fixUtf8("%1$s , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme."), name));
                    System.out.println(String.format("Seu(s) assentos ficam na fileira %1$s, seus assentos comprados foram %2$s", fileiraB, assentosB));

                }
                break;
        }
    }


    private static String fixUtf8(String message) {
        return new String(message.getBytes(StandardCharsets.UTF_8));
    }
}
