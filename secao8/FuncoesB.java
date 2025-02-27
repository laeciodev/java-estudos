package secao8;

public class FuncoesB {

    //Escopo-global
    static int  globalVar = 20;

    public static void main(String[] args) {

        // 5 - Funções com condicionais

        String r1 = verificarAcesso(20, true, true);

        System.out.println(r1);

        String r2 = verificarAcesso(20, false, false);

        System.out.println(r2);

        // 6 - Funções com switch
        String r3 = obterDiaDaSemana(10);

        System.out.println(r3);

        // 7 - System.exit
        verificarAutenticacao("admin", "SenhaSegura");

        System.out.println("Oi!");

        // 8 - documentação função


        System.out.println(calcularMedia(5, 6, 7));

        // 9 - Escopo
        // escopo-local
        int localVar = 10;

        if(true){
            System.out.println(localVar);
        }

        System.out.println(globalVar);

        escopoLocal(localVar);
    }

    public static String verificarAcesso(int idade, boolean temCarteira, boolean temHistoricoNegativo) {

        if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
            return "Acesso permitido: todos os critérios atendidos";
        }else if (idade >= 18 && temCarteira && temHistoricoNegativo){
            return "Acesso negado: histórico negativo detectado";
        } else {
            return "Acesso negado: critérios não atendidos";
        }
    }

    public static String obterDiaDaSemana(int dia){

        // cada case é um valor possível para a variável dia
        switch (dia){
            case 1:
                return "Domingo";
            case 2:
                return "Segunda";
            case 3:
                return "Terça";   
            case 4:
                return "Quarta";
            case 5: 
                return "Quinta";
            case 6: 
                return "Sexta";
            case 7: 
                return "Sábado";
            default:
                return "Dia inválido";
        }
    }

    public static void verificarAutenticacao(String usuario, String senha){

        if (!usuario.equals("admin") && !senha.equals("SenhaSegura")){
            System.out.println("Autenticação falhou!");
            System.exit(1);
        }
         
        System.out.println("Autenticação bem sucedida!");

    }


/**
 * 
 * Calcula a média de 3 números inteiros
 * 
 * @param num1 O primeiro número/nota a ser enviado
 * @param num2 O segundo número/nota a ser enviado
 * @param num3 O terceiro número/nota a ser enviado
 * @return a média dos 3 números
 */
    public static double calcularMedia(int num1, int num2, int num3){
        return (num1 + num2 + num3)/3;
    }

    public static void escopoLocal(int a){
        System.out.println(globalVar);
        System.out.println(a);
    }
}
