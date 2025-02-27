package secao5;

public class Condicionais2 {

    public static void main(String[] args) {

        // 1 -Condicional ternária
        int numero = 10;

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println(numero + " é " + resultado);

        // 2 - If encadeado

        int idade = 15;
        boolean temCarteira = true;

        if (idade >= 18) {

            if (temCarteira) {
                System.out.println("Você pode dirigir");
            } else {
                System.out.println("Precisa ter a habilitação para dirigi!");
            }

        } else {
            System.out.println("Você não pode dirigir ainda");
        }

        // 3 - Precedência 

        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean resultado2 = a && b || c;

        System.out.println(resultado2);

        boolean resultado3 = a || b && c;

        System.out.println(resultado3);
    }
}