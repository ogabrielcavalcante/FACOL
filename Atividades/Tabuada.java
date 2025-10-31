package Atividades;

import java.util.Scanner;

public class Tabuada {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero para saber sua tabuada: ");
		int num = sc.nextInt();
		int result = 0;
		for (int i=1;i<=10;i++) {
			result=i*num;
			System.out.println(num+"*"+i+"="+result);
		}

	}

}

