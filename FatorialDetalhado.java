import java.util.Scanner;

public class FatorialDetalhado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = leitor.nextInt();
        
        long fatorial = 1;
        
        // Início da impressão da sequência
        System.out.print(n + "! = ");
        
        for (int i = n; i >= 1; i--) {
            fatorial *= i;
            
            // Controle da impressão para não colocar "x" depois do 1
            if (i > 1) {
                System.out.print(i + " . ");
            } else {
                System.out.print(i);
            }
        }
        
        System.out.println(" = " + fatorial);
    }
}