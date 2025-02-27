package secao8;

public class FuncoesBuiltln {
    
    public static void main(String[] args) {
        
        // 10 - Funções Built-in de string

        String frase = "Java é muito bom";

        //length - conta a quantidade de caracteres
        System.out.println(frase.length());

        // int = inteiro
        //String => S => letra maiúscula inicial => classe

        System.out.println(frase.substring(0, 4)); //Java

        System.out.println(frase.toUpperCase()); //tudo maiúsculo
        System.out.println(frase.toLowerCase());//tudo minúsculo

        System.out.println(frase.replace("a", "x")); // replace substitui a por x

        String fraseModificada = frase.replace("a", "x");
        System.out.println(fraseModificada);

        // 11 - Funções Built-in de números
        System.out.println(Math.sqrt(25)); //raiz quadrada
        System.out.println(Math.sqrt(81)); //raiz quadrada

        System.out.println(Math.pow(2,3));
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));

        System.out.println(Math.max(50,100));

        double raizQuadrada = Math.sqrt(16);

        System.out.println("A raiz quadradada de 16 é: " + raizQuadrada);
    }

}
