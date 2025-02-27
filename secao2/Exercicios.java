package secao2;

public class Exercicios {

    public static void main(String[] args) {

        /*
         * exercicio 1
         * Crie uma variável int para armazenar o valor 10.
         * Crie uma segunda variável int que armazene o dobro do valor da primeira
         * variável usando operadores aritméticos.
         * Exiba o resultado.
         */

        int val1 = 10;
        int val2 = val1 * 2;
        System.out.println("O dobro de " + val1 + " é " + val2);

        /*
         * exercicio 2
         * Declare uma variável char que armazena a letra 'b'.
         * faça o casting explicito para int e exiba o resultado.
         */

        char letra = 'b';
        int letraInt = (int) letra;

        System.out.println(letra);
        System.out.println(letraInt);

        /*
         * exercicio 3
         * Declare duas variáveis double para armazenar os valores 15.75 e 20.40.
         * Some os valores dessas variáveis e armazene o resultado em uma nova variável
         * double.
         * Exiba o resultado.
         */

        double valor1 = 15.75;
        double valor2 = 20.40;
        double soma = valor1 + valor2;

        System.out.println("O resultado da soma é: " + soma);

        /*
         * exercicio 4
         * declare uma variável long para armazenar o número 2 bilhoes (2_000_000_000).
         * Em seguida, declare uma variável int e faça casting explicito do valor long para int
         * e exiba o resultado.
         */

        long num = 2_000_000_000L;
        int numInt = (int)num;

        System.out.println(numInt);

        /*
         * exercicio 5
         * Escreva um programa que crie uma variável String com o valor "Olá, Mundo!".
         * Em seguida, crie outra variável String que concatene a primeira com o texto "Bem-vindo ao Java!".
         */

         String saudacao = "Olá, Mundo! ";
         String saudacao2 = "Bem-vindo ao Java!";

         System.out.println(saudacao + saudacao2);

         //12 - constantes

         final int  DIAS_DA_SEMANA = 7;

         System.out.println("Dias da Semana: " + DIAS_DA_SEMANA);


         //13 - var

         var z = 10;

         System.out.println(z);

         z = 5;
         System.out.println(z);

         var texto2 = "teste";

          texto2 = "10";

         System.out.println(texto2);

         //14 - scanner

         
    }
}
