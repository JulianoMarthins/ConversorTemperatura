package programa;

import java.util.Scanner;

/*
 * @ Programado por JulianoMarthins
 */

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Conversor de temperatura\n");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		System.out.println("Digite:\n1 -> Celsius\n2 -> Fahrenheit");

		int escolha = sc.nextInt();

		switch (escolha) {
		case 1:

			// Formula -> (0 °C x 9 / 5) + 32 °F
			System.out.println("Digite quantos graus celsius: ");
			double celcius = sc.nextDouble();
			double fahrenheit = (celcius * 9.0 / 5.0) + 32;
			System.out.printf("Temperatura: %.2f° Fahrenheit\n", fahrenheit);
			break;

		case 2:

			// Formula -> (°F - 32) * 5 / 9 = C°
			System.out.println("Digite quantos graus Fahrenheit: ");
			fahrenheit = sc.nextDouble();
			celcius = (fahrenheit - 32) * 5.0 / 9.0;
			System.out.printf("Temperatura: %.2f° celsius\n", celcius);
			break;

		default:
			System.out.println("Você digitou um valor inválido: ");
		}

		sc.close();
	}

}
