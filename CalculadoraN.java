import java.util.Scanner;

public class CalculadoraN {

    public static void main(String[] args) {
        try ( // Inicializa o leitor de dados
                Scanner leitor = new Scanner(System.in)) {
            System.out.print("Digite um número para ver sua tabuada: ");
            
            // Verifica se a entrada é um número inteiro válido
            if (leitor.hasNextInt()) {
                int n = leitor.nextInt();
                
                System.out.println("\n--- Tabuada do " + n + " ---");
                
                // Laço de repetição de 1 a 10
                for (int i = 1; i <= 10; i++) {
                    int resultado = n * i;
                    System.out.printf("%d x %d = %d%n", n, i, resultado);
                }
                
                System.out.println("-----------------------");
            } else {
                System.out.println("Erro: Por favor, insira apenas números inteiros.");
            }
        }
    }
}
