import java.util.Scanner;
import java.util.Locale;

public class CalculadoraTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        double soma = 0;
        int totalTemperaturas = 12;
        
        for (int i = 1; i <= totalTemperaturas; i++) {
            double temp;
            boolean valida = false;
            
            do {
                System.out.print("Digite a temperatura " + i + " (entre 4 e 10): ");
                
                if (scanner.hasNextDouble()) {
                    temp = scanner.nextDouble();
                    
                    if (temp >= 4.0 && temp <= 10.0) {
                        soma += temp;
                        valida = true;
                    } else {
                        System.out.println("Temperatura inválida! Por favor, insira um valor entre 4 e 10.");
                    }
                } else {
                    System.out.println("Entrada inválida! Por favor, insira um número.");
                    scanner.next();
                }
            } while (!valida);
        }
        
        double media = soma / totalTemperaturas;
        
        System.out.printf(Locale.forLanguageTag("pt-BR"), "\nA média de hoje das temperaturas é: %.1fº C\n", media);
        
        scanner.close();
    }
}
