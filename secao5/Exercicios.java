package secao5;

import java.util.Scanner;

public class Exercicios {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Exercicio 1

        // System.out.println("Digite o preço do produto: ");
        // double preco = scanner.nextDouble();

        // if (preco< 50) {
        //     System.out.println("Categoria: Barato");
        // } else if (preco >=50 && preco <= 100) {
        //     System.out.println("Categoria: Médio");
        // }else {
        //     System.out.println("Categoria: Caro");
        // }


        //Exercicio 2

        // System.out.println("Login");

        // System.out.println("Digite seu usuário: ");
        // String usuario = scanner.next();

        // System.out.println("Digite sua senha: ");
        // String senha = scanner.next();

        // if(usuario.equals("admin") && senha.equals("1234")){
        //     System.out.println("Acesso permitido!");
        // }else{
        //     System.out.println("Acesso negado!");
        // }


        //Exercicio 3

        // System.out.println("Digite um número para verificar se é par ou ímpar: ");
        // int num = scanner.nextInt();

        // if(num % 2 == 0){
        //     System.out.println("O número " +num+ " é PAR!");
        // }else{
        //     System.out.println("O número " +num+ " é ÍMPAR!");
        // }
        

        //Exercicio 4

        // System.out.println("Informe um número de 1 a 7(refente ao dia da semana):");
        // int dia = scanner.nextInt();

        // switch (dia){
        //     case 1:
        //     System.out.println("Final de Semana: Domingo");
        //         break;
        //     case 2:
        //     System.out.println("Dia da Semana: Segunda-feira");
        //         break;
        //     case 3:
        //     System.out.println("Dia da Semana: Terça-feira");
        //         break;
        //     case 4:
        //     System.out.println("Dia da Semana: Quarta-feira");
        //         break;
        //     case 5:
        //     System.out.println("Dia da Semana: Quinta-feira");
        //         break;
        //     case 6:
        //     System.out.println("Dia da Semana: Sexta-feira");
        //         break;
        //     case 7:
        //     System.out.println("Final de Semana: Sábado");
        //         break;
        //     default:
        //     System.out.println("Número inválido!");
        //         break;
        // }


        //Exercicio 5 

        // System.out.println("Informe um número para verificar se está no intervalo:");
        // int numIntervalo = scanner.nextInt();

        // if(numIntervalo >= 10 && numIntervalo <=20){
        //     System.out.println("Dentro do intervalo");
        // }else {
        //     System.out.println("Fora do intervalo");
        // }


        //Exercicio 6

        System.out.println("Informe uma letra:");
        char letra = scanner.next().toLowerCase().charAt(0);

        switch(letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("Vogal");
            break;
        default:
        System.out.println("Consoante");
        break;
        }

        scanner.close();
    }
}
