package secao2;

import java.util.Scanner;

public class TesteScanner {
    
    public static void main(String[] args) {
        

        /* 1 - testando scanner, System.in é basicamente um tipo de entrada ex: teclado*/
        Scanner scanner = new Scanner(System.in);

        //Mensagem para o usuário entender o que precisa digitar
        System.out.println("Digite o seu nome: ");

        //Resgata o valor do terminal
        String nome = scanner.nextLine();
        
        System.out.println("Digite sua idade: ");

        int idade  = scanner.nextInt();

        //Exibe o valor digitado
        System.out.println("Olá, " + nome + ", você tem " + idade + " anos.");


       

        //2- problema do next 

        System.out.println("Digite um número: ");

        int num = scanner.nextInt();

        //depois que o nextInt é chamado, o nextLine não funciona, pois ele pega o enter do nextInt
        scanner.nextLine();

        System.out.println("Digite um texto: ");
        
        String txt = scanner.nextLine();

        System.out.println("Os dados são, num = " + num + " e txt = " + txt);
         //Fecha o scanner para evitar memory leak -> vazamento de memória
         scanner.close();
    }
}
