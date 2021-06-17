package proa.java.exercicios;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Inicial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Bem vindo ao Caixa Eletronico em JAVA");

        System.out.println(fixUtf8("Por favor informe seu nome: "));
        String name = sc.next();

        int tentativas = 3;
        double saldo = 999.12;


        while (tentativas > 0) {

            System.out.print("\nInforme sua senha: ");
            int senha = sc.nextInt();

            if (senha == 1234) {


                System.out.print(fixUtf8("Escolha uma das opções:\n1. Saldo\n2. Saque\n3. Deposito\n4. Sair"));
                try {
                    System.out.print(fixUtf8("\nEscolha uma opção: "));


                } catch (Exception e) {

                    System.out.print(fixUtf8("Houve um erro. Por favor, escolha uma opção entre 1, 2, 3 e 4"));
                    System.out.print("Erro: " + e);
                }

                int opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print(fixUtf8(String.format("\nSeu saldo é de: R$ %1$s ", saldo)));
                        break;

                    case 2:
                        System.out.print(fixUtf8(String.format("\nSeu saldo é de: %1$s ", saldo)));
                        System.out.print("\nInforme o valor para retirada: ");
                        System.out.print(fixUtf8("\nPara cancelar a opção digite -100. \n"));
                        double retirada = sc.nextDouble();

                        if (retirada > 0) {
                            saldo = saldo - retirada;
                            System.out.println("Saque efetuado com sucesso!\n\n");
                            System.out.print(fixUtf8(String.format("\nSeu saldo atual é de: %1$s ", saldo)));

                        } else if (retirada == -100) {
                            System.out.print(fixUtf8("Operação cancelada!"));
                        } else if (retirada > saldo) {
                            System.out.print(fixUtf8("\nNão há saldo suficiente na conta."));
                        } else {
                            System.out.print(fixUtf8("\nSua conta não foi movimentada."));
                        }
                        break;

                    case 3:
                        System.out.print("\nPor favor, informe o valor para deposito: ");

                        System.out.print(fixUtf8("\nPara cancelar a opção digite -100. \n"));

                        double deposito = sc.nextDouble();

                        if (deposito > 0) {
                            saldo = saldo + deposito;
                            System.out.println("Deposito efetuado com sucesso!\n\n");
                            System.out.print(fixUtf8(String.format("\nSeu saldo é de: %1$s ", saldo)));
                        } else if (deposito == -100) {
                            System.out.print(fixUtf8("Operação cancelada!"));
                        } else {
                            System.out.print(fixUtf8("\nVocê não pode depositar valores negativos."));
                        }
                        break;
                    case 4:
                        System.out.print(String.format("\nObrigado %1$s por utilizar o nosso Banco.", name));
                        System.exit(0);
                        break;
                    default:
                        System.out.print(fixUtf8("\nOpção inválida"));
                }
            } else {
                System.out.print(fixUtf8("Senha inválida\n"));
                tentativas -= 1;

                if (tentativas > 0) {
                    System.out.print(fixUtf8("\nVocê possui " + tentativas + " tentativa(s)"));
                } else {
                    System.out.print("\nSeu acesso foi bloqueado.");
                    sc.close();
                }
            }
        }
    }

    private static String fixUtf8(String message) {
        return new String(message.getBytes(StandardCharsets.UTF_8));
    }
}