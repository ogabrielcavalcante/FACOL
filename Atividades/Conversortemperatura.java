package Atividades;

import java.util.Scanner;

public class Conversortemperatura {

	
	public static double ConverterToFahrenheit(double celsius) {

		return celsius * 1.8 + 32;
	}

	public static double ConverterToKelvin(double celsius) {

		return celsius + 273.15;
	}


	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);

		System.out.println("Insira a temperatura em Celsius: ");

		double c = 0.0;

		// Ler a linha inteira para aceitar tanto vírgula quanto ponto como separador decimal
		try {
			String line = cs.nextLine().trim();
			// Caso o usuário tenha pressionado Enter antes de digitar (nextLine pode retornar ""), tentar nextLine novamente
			if (line.isEmpty()) {
				line = cs.nextLine().trim();
			}
			line = line.replace(',', '.');
			c = Double.parseDouble(line);
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida. Digite um número (use . ou , como separador decimal).");
			cs.close();
			return;
		}

		double f = ConverterToFahrenheit(c);
		double k = ConverterToKelvin(c);

		System.out.println("Valor em Fahrenheit: " + f + "\n");
		System.out.println("Valor em Kelvin: " + k);

		cs.close();

	}

}