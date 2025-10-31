package Atividades;

import java.util.Scanner;

public class Parouimpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número para verificar se ele é Par ou Ímpar:");
        
        long numero = sc.nextLong();  // <-- use long
        
        if (ehPar(numero)) {
            System.out.println("É par!");
        } else {
            System.out.println("É ímpar!");
        }
        
        sc.close();
    }
    
    public static boolean ehPar(long num) {  // <-- e aqui também
        return num % 2 == 0;
    }
}
