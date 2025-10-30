package Atividades;

import java.util.Scanner;

public class Calculadora {

    // Funções simples pra cada operação
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtrai(double a, double b) {
        return a - b;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Erro! Não é possível dividir por zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        String op = sc.next();

        double resultado = 0;

        if (op.equals("+")) {
            resultado = soma(num1, num2);
        } else if (op.equals("-")) {
            resultado = subtrai(num1, num2);
        } else if (op.equals("*")) {
            resultado = multiplica(num1, num2);
        } else if (op.equals("/")) {
            resultado = divide(num1, num2);
        } else {
            System.out.println("Operação inválida!");
            sc.close();
            return; // para o programa
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
