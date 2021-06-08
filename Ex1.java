package proa.java.exercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Ex1 {

    private final static Logger logger = LoggerFactory.getLogger(Ex1.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        logger.info("Digite o valor: ");
        var n = scanner.nextInt();


        if (n < 0) {
            logger.info("O valor é negativo");
        } else if (n > 0) {
            logger.info("O valor é positivo");
        } else if (n == 0) {
            logger.info("O valor é 0");
        }
    }
}
