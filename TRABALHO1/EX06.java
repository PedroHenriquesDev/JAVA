public class EX06 {

	public static void main(String[] args) {
		import java.util.Scanner;

		public class CalculoSalario {
		    public static void main(String[] args) {
		        
		        Scanner scanner = new Scanner(System.in);
		        
		        
		        System.out.print("Digite o salário bruto do funcionário: ");
		        double salarioBruto = scanner.nextDouble();
		        
		        
		        System.out.print("Digite o valor do desconto do INSS: ");
		        double descontoINSS = scanner.nextDouble();
		        
		        
		        double salarioLiquido = salarioBruto - descontoINSS;
		        
		        
		        System.out.println("O salário líquido é: R$ " + salarioLiquido);
		        
		        
		        scanner.close();
		    }
		}

	}

}
