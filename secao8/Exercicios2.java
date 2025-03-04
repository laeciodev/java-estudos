package secao8;

public class Exercicios2 {

    public static void main(String[] args) {

        System.out.println(anoBissexto(2025));
    }

    public static String anoBissexto(int ano){
        if (ano %  400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
            return "Ano bissexto";
    }else{
        return "Ano não bissexto";
    }
    }
}