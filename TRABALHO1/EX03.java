//3. Conversão de Temperatura
//Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.

import java.util.Scanner;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int celsius;
		int Fahrenheit;
		
		System.out.println("Digite o valor da temperatura em graus celsius");
		celsius = sc.nextInt();
		
		Fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("O valor em Fahrenheit é: " + Fahrenheit);
		
		
		sc.close();
	}

}
