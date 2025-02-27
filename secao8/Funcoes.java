package secao8;

public class Funcoes {

    public static void main(String[] args) {
        

        // 1 - Criando a primeira função

        saudacao();
        saudacao();
        saudacao(); 

        // 2 - Parâmetros
        soma(2, 4);
        soma(12, 5);

        saudar("Laécio");

        // 3 - Return
        dobrar(5);

        int numero = 10;

        int numeroDobrado = dobrar(numero);
        System.out.println("O número dobrado é: " + numeroDobrado);

        System.out.println(dobrar(15));

        // 4 - retorno em variavel
        String r1 = verificarPar(5);
        String r2 = verificarPar(2);

        System.out.println(r1);
        System.out.println(r2);

        int x = dobrar(soma2(2, 4));

        System.out.println(x);
    
    }


    //Nivel de acesso, Static => não preciso instanciar classe para executar, Void => tipo de retorno
    //Nome, os parenteses(args) , bloco {}
    public static void saudacao(){

        System.out.println("Olá, esta é a minha primeira função em Java");
    }

    public static void soma(int a, int b){
        int resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);

    }

    public static void saudar(String nome){

        System.out.println("Olá, " + nome + ", tudo bem?");
    }


    // Parâmetros de funções diferentes, podem ter o mesmo nome
    public static int dobrar(int n) {
        return n * 2;
    }

    public static String verificarPar(int n) {

    if (n % 2 == 00){
        return "O número " + n + " é par!";
    }else {
        return "O número " + n + " é ímpar!";
    }
    }

    public static int soma2(int a, int b){
        return a + b;
    }

}
