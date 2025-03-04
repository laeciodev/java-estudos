package secao8;

public class Exercicios {
    public static void main(String[] args) {

        // Exercício 1
        double celsius = 25.0;
        double Fahrenheit = converterTemperatura(celsius);
        System.out.println("A temperatura de " + celsius + "°C é equivalente a " + Fahrenheit + "°F");

        // Exercício 2
        System.out.println("O fatorial de 10 é: " + calcularFatorial(10));

        // Exercício 3
        System.out.println(verificarParidade(2));

        // Exercício 4
        System.out.println(classificarNota(8));
        System.out.println(classificarNota(7));
        System.out.println(classificarNota(6));
        System.out.println(classificarNota(10));

        // Exercício 5
        verificarIdade(19);

        // Exercício 6

        int [] numeros = {10, 5, 22, 44, 5};
        System.out.println(encontrarMaior(numeros));
    }

    // Função para converter temperatura de Celsius para Fahrenheit
    public static double converterTemperatura(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Função para calcular o fatorial de um número
    public static int calcularFatorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }

    // Função para verificar se um número é par ou ímpar
    public static String verificarParidade(int numero) {

        if (numero % 2 == 0) {
            return ("O número " + numero + " é PAR!");
        } else {
            return ("O número " + numero + " é ÍMPAR!");
        }
    }

    public static String classificarNota(int nota) {

        if (nota < 0 || nota > 10) {
            return "Nota inválida!";
        }

        switch (nota) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }

    public static void verificarIdade(int idade) {
        if (idade < 18){
            System.out.println("Acesso negado");
            System.exit(0);
        }
        System.out.println("Acesso permitido");
    }

    public static int encontrarMaior(int [] numeros){

        int maior = numeros[0];


        //Contador, cond. execução, Incremento
        for(int i = 1; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }

        return maior;
    }
}
