package secao8;

import java.util.Arrays;
import java.util.List;

public class FuncoesC {
    
    public static void main(String[] args) {
        // 12 - Recursiva

        int soma = somaRecursiva(10);
        System.out.println(soma);

        // 13 - metodo overload
        System.out.println(soma(2,5));
        System.out.println(soma(2,5, 6));
        System.out.println(soma(2.5,5.7, 6.2));

        // - Função anônima
        
        Runnable tarefa = () -> System.out.println("Minha função anônima!");
        
        tarefa.run();

        List<String> nomes = Arrays.asList("Ana", "Pedro", "Paulo");

        nomes.forEach(nome -> System.out.println(nome));

    }

    public static int somaRecursiva(int n){

        if(n == 1){
            return 1;
        }else{
            return n + somaRecursiva(n - 1); // 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 55
        }
    }

    // Method Overload -> Utilizar o mesmo nome para metodos diferentes, com parametros diferentes
    public static int soma(int a, int b){
        return a + b;
    }

    public static int soma(int a, int b, int c){
        return a + b + c;
    }
     
    public static double soma(double a, double b, double c){
        return a + b + c;
    }


}
