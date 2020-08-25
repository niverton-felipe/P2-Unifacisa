import java.util.Locale;
import java.util.Scanner;

public class Exercicio1021Uri {
    public static void main (String[] args){

        int nota100, nota50, nota20, nota10, nota5, nota2;
        int moeda100, moeda50, moeda25, moeda10, moeda5, moeda1;


        Scanner myObj = new Scanner(System.in);
        myObj.useLocale(Locale.US);

        String valorEntrada = myObj.nextLine();
        String[] valorSeparado = valorEntrada.split("\\.");

        int valorNotas = Integer.parseInt(valorSeparado[0]);
        int valorMoedas = Integer.parseInt(valorSeparado[1]);

        nota100 = valorNotas / 100;
        int restante = valorNotas % 100;
        nota50 = restante / 50;
        restante %= 50;
        nota20 = restante / 20;
        restante %= 20;
        nota10 = restante / 10;
        restante %= 20;
        nota5 = restante / 5;
        restante %= 5;
        nota2 = restante / 2;
        restante %= 2;
        moeda100 = restante / 1;
        moeda50 = valorMoedas / 50;

        int restanteMoedas = valorMoedas % 50;
        moeda25 = restanteMoedas / 25;
        restanteMoedas %= 25;
        moeda10 = restanteMoedas / 10;
        restanteMoedas %= 10;
        moeda5 = restanteMoedas / 5;
        restanteMoedas %= 5;
        moeda1 = restanteMoedas / 1;

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda100 + " moedas(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1 + " moeda(s) de R$ 0.01");


    }
}
