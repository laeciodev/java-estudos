package secao2;

public class Variavel {
    
    public static void main(String[] args) {
        
        // 1 -  O que são variáveis
        // tipo -> nome -> atribuir um valor;
        String nome = "Laécio";
        int idade = 21;

        //nome => Laécio
        System.out.println("Olá, " + nome + " você tem " + idade + " anos." );

        // 2 - Atribuição de variáveis

        String teste = "Teste";

        String testando = teste;
        System.out.println(testando);

        long numeroGrande = 999999999999999L;

        //int numeroGrandeDois = numeroGrande;

        System.out.println(numeroGrande);

        // 3 - Comentários
        /*linha 1
          linha 2
          Linha 3
         */

         // 4 - Strings

         String firstName = "Laécio";
         String lastName = "Jesus";


         System.out.println(firstName + " " + lastName);

        System.out.println("O nome dele é " + firstName);

        String fullName = firstName + " " + lastName;


        //concatenação = operador + nas strings, para uni-las
        System.out.println(fullName);

        // 5 - Char

        char letra = 'a';

        System.out.println(letra);


        String letra2 = "A";

        System.out.println(letra2);

        // 6 - int

        int n = 42;
        System.out.println(n);
        System.out.println(n + 5);
        System.out.println(n * 5);
        System.out.println(n - 5);
        System.out.println(n / 5);


        //  7 - long

        long populacaoMundial = 7800000000L;
         System.out.println(populacaoMundial);

        long grandeNumero = 1_000_000L;

        System.out.println(grandeNumero);

        // 8 - Double

        double preco = 19.99;

        System.out.println(preco - 12);

        System.out.println(preco / 2);

        double pi = 3.141_592_123;

        System.out.println(pi);

        double valorComD = 12.1D;

        System.out.println(valorComD);


        // 9 - OP. aritméticos
        
        int soma2 = 12 + 5;

        System.out.println(soma2);
        System.out.println(22 / 4);
        System.out.println(22 - 4);
        System.out.println(22 * 4);
        System.out.println(22 % 4);
        System.out.println(22.0 / 5.5);

        /*para ter um resultado quebrado (1.5), pelo menos um dos números deve ser double */ 

        System.out.println(10.0/3);

        // 10 - Op. aritméticos p2

        int x  = 5;

        x++;
        x++;
        x++;
        x++;
        x++;
        x++;

        System.out.println(x);

        int y = 5;

        y--;

        System.out.println(y);
         int a = 10;

         a += 5;
         System.out.println(a);

         int b = 10;

         b -=5;

         System.out.println(b);

         b-= a;

            System.out.println(b);

        // 11 - type casting

        int numero2 = 42;

        long numeroLong = numero2;
        double numeroDouble = numero2;

        System.out.println(numeroLong); 
        System.out.println(numeroDouble);

        // explicito (narrowing)

        double valorDouble = 9.78;

        int valorInt = (int) valorDouble;

        System.out.println(valorInt);
            
        //casting de char para int

        char letra3 = 'A';

        int codigoAscii = (int) letra3;
        System.out.println(codigoAscii);
        
    }
}
