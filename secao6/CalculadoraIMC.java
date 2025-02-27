package secao6;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de IMC");
        System.out.println("--------------------------------------");
        System.out.println("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();
        
        System.out.println("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);


        System.out.println(" ");
        System.out.printf("Seu IMC é: %.2f\n", imc);
        
        if(imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

        scanner.close();
    }
}