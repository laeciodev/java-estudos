package secao5;

public class Switch {
    
    public static void main(String[] args) {
        // 11 - Switch case e break

        //validar dia de semana baseado no número

        int diaDaSemana = 5;

        switch(diaDaSemana){

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }

        // 12 - Default

        int n = 2;

        switch (n) {
            case 1:
                System.out.println("É 1");
                break;
            case 2:
                System.out.println("É 2");
                break;
            case 3:
                System.out.println("É 3");
                break;
            default:
                System.out.println("Número não encontrado!");
                break;
        }

        // 13 - switch sem break

        int num = 1;

        switch (num) {
            case 1:
            System.out.println("Número 1");
            case 2:
            System.out.println("Número 2");
            case 3:
            System.out.println("Número 3");
            default:
            System.out.println("Número 4");
        }
    }
}
