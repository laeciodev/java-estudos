package secao9_conversorTemperatura;

import java.util.Scanner;

public class conversorDeTemperatura {
    
    // Metodo para rodar o programa
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");

        int opcao = scanner.nextInt();

        if(opcao == 1){
            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = converterCelsius(celsius);
            System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");
        } else if(opcao == 2){
            System.out.println("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = converterFahrenheit(fahrenheit);
            System.out.println(fahrenheit +  "°F equivale a " + celsius + "°C");
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    // Funções de Celsius e Farenheit

    public static double converterCelsius(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double converterFahrenheit(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
}