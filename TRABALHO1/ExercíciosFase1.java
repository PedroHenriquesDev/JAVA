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

//4. Cálculo de Média Simples
//Faça um programa que solicite ao usuário três notas (valores decimais) e exiba a média aritmética delas.


import java.util.Scanner;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("O valor da média é: " + media);

		
		sc.close();
	}

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

//6. Cálculo do Salário
//Escreva um programa que receba o salário bruto de um funcionário e o valor de desconto do INSS. O programa deve calcular e exibir o salário líquido.

import java.util.Scanner;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario;
		double inss;
		double salarioBruto;
		
		System.out.println("Digite o valor do salario: ");
		salario = sc.nextDouble();
		
		System.out.println("Digite o valor do INSS: ");
		inss = sc.nextDouble();
		
		salarioBruto = salario - inss;
		
		System.out.println("O valor do salario total: "+ salarioBruto);

		
		sc.close();
	}

//7. Cálculo do Perímetro e Área de um Retângulo
//Faça um programa que solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.


import java.util.Scanner;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double base;
		double altura;
		double area;
		double perimetro;
		
		System.out.println("Digite o valor da base: ");
		base = sc.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = 2 * (base * altura);
		
		System.out.println("O valor da área é: "+ area);
		System.out.println("O valor do perimetro é: "+ perimetro);
		
		sc.close();
	}

//8. Cálculo do Volume de uma Esfera
//Crie um programa que leia o raio de uma esfera e calcule o seu volume.

import java.util.Scanner;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double volume;
		
		System.out.println("Digite o valor do raio");
		raio = sc.nextDouble();
		
		volume = (4/3)*3.14159*(raio*raio*raio);
		
		System.out.println("O valor do Volume é: "+volume);
		
		sc.close();
	}

//9. Conversão de Moeda
//Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia. O programa deve calcular e exibir o valor equivalente em dólares (US$).

import java.util.Scanner;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double real;
		double dolar;
		double conversao;
		
		System.out.println("Digite o valor em reais: ");
		real = sc.nextDouble();
		
		System.out.println("Digite o valor da cotação do dolar: ");
		dolar = sc.nextDouble();
		
		conversao = real * dolar;
		
		System.out.println("O valor da conversao é: "+ conversao);
			
		sc.close();
	}

//10. Distância Entre Dois Pontos
//Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois pontos no plano cartesiano e calcule a distância entre eles.












  
