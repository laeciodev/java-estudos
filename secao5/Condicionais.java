package secao5;

public class Condicionais {

    public static void main(String[] args) {

        // 1 - o que é boolean?
        // boolean isTrue = true;
        // boolean isFalse = false;

        // System.out.println(isTrue);
        // System.out.println(isFalse);

        // Operadores de comparação

        int x = 10;

        System.out.println(x == 10);

        System.out.println(x == 9);

        System.out.println(x != 5);

        System.out.println(x != 10);

        System.out.println(x > 10);

        System.out.println(x >= 10);

        System.out.println(x < 10);

        System.out.println(x <= 10);

        // 3 - atribuição e comparação

        int n = 10; // atribuição
        int m = 5;

        System.out.println(n == m);

        // 4 - comparação de strings

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));

        System.out.println(str2.equals(str1));

        System.out.println(str1.equals("Java"));

        String str3 = "JAVA";
        System.out.println(str1.equalsIgnoreCase(str3)); // ignora maiúsculas e minúsculas

        // 5 - if

        int numero = 10;

        // Baseado em uma comparação, eu executo um bloco de código
        if (numero > 552) {
            System.out.println("O número é maior que 5");
        }

        // if com strings

        String texto = "Teste";

        if (texto.equals("Teste")) {
            System.out.println("O texto é: Teste");
        }

        // 6 - else

        int q = 7;

        if (q > 10) {
            System.out.println("Q é maior que 10");
        } else {
            System.out.println("Q é menor que 10. Por favor, informe um número maior que 10");
        }

        if (texto.equals("Teste2")) {

            System.out.println("O texto é Teste");
        } else {
            System.out.println("O texto não é igual!");
        }

        // 7 - else if

        double nota = 6;

        if (nota >= 9) {
            System.out.println("Você está aprovado(a)!");
        } else if (nota == 6){
            System.out.println("Você está na média!");
        } else if (nota < 7) {
            System.out.println("Você está de recuperação!");
        } else {
            System.out.println("Você está reprovado(a)!");
        }

        int num = 5;

        if (num > 3 || num < 5){
            System.out.println("Alguma coisa"); // para sempre no primeiro verdadeiro
        } else if (num == 5){
            System.out.println("Outra coisa aqui!");
        }
    }
}