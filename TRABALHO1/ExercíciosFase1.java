//1. Soma de Dois Números
//Escreva um programa que solicite ao usuário dois números inteiros e exiba a soma deles.

import java.util.Scanner;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int soma;
		
		soma = num1 + num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();
		
		sc.close();
	}
 

//2. Área de um Círculo
//Desenvolva um programa que leia o raio de um círculo e calcule sua área.

import java.util.Scanner;

public class exercicio01 {

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

}


  
