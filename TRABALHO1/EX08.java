import java.util.Scanner;

public class CalculoVolumeEsfera {
    public static void main(String[] args) {
        
        final double PI = 3.14159;
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();
        
       
        double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);
        
        
        System.out.printf("O volume da esfera é: %.2f\n", volume);
        
        
        scanner.close();
    }
}
