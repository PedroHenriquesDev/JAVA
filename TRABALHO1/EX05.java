//5. Conversão de Idade para Dias
//Desenvolva um programa que leia a idade de uma pessoa em anos e exiba a quantidade aproximada de dias que ela já viveu.


import java.util.Scanner;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		int dias;
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		dias = idade * 365;
		
		System.out.println("A quantidade de dias aproximadamente é de: "+ dias);
		
		
		
		sc.close();
	}
