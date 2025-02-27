package secao5;

public class OperadoresLogicos {

    public static void main(String[] args) {
        
        // 8 - AND

        int idade = 18;
        boolean temCarteiraDeMotorista = true;

        System.out.println(idade >= 18 && temCarteiraDeMotorista);
        System.out.println(idade >= 18 && temCarteiraDeMotorista == true);

        boolean carteiraVencida = false;

        System.out.println(idade >= 18 && temCarteiraDeMotorista && carteiraVencida == false);

        int a = 10;
        int b = 20;

        if (a > 5 && b > 10){
            System.out.println("Deu certo!");
        }

        if (a > 55 && b > 10){
            System.out.println("Deu certo! 2");
        }

        // 9 - OR

        boolean estaChovendo = false;
        boolean temGuardaChuva = true;

        System.out.println(estaChovendo || temGuardaChuva);

        System.out.println(false || false);

        System.out.println(10 > 20 || 100 == idade);

        int idade2 = 16;
        boolean ehMembro = true;

        if(idade2 > 16 || ehMembro){
            System.out.println("Você pode entrar!");
        } else{
            System.out.println("Entrada negada!");
        }

        // 10 - NOT

        System.out.println(estaChovendo);
        System.out.println(!estaChovendo);

        System.out.println(!(estaChovendo || !temGuardaChuva));
 
    }
}
