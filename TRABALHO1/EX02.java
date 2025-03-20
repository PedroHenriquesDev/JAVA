//2. Área de um Círculo
//Desenvolva um programa que leia o raio de um círculo e calcule sua área.

import java.util.Scanner;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int raio;
		double area;
		
		System.out.println("Digite o valor do raio");
		raio = sc.nextInt();
		
		area = 3.14159 * (raio * raio);
		
		System.out.println("O valor da area é: "+ area);
		
		
		sc.close();
	}
