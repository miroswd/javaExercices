/***
 * Input de 1 número de 4 algarismos
 * Separar as notas, das quais pode ser representado
 */

import java.util.Scanner;

public class ContaCedulas{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número de 4 algarismos: ");
        int number = input.nextInt();

        String numberStr = Integer.toString(number);

        // Formatando para 4 algarismos
        for (int i = 0; numberStr.length() < 4; i++){
            numberStr = "0" + numberStr;
        }

        // Impedindo que o número tenha mais de 4 algarismos
        while (numberStr.length() > 4){
            System.out.print("Você só pode usar 4 algarismos.\nDigite um número válido: ");
            number = input.nextInt();
            numberStr = Integer.toString(number);

            if (numberStr.length() <= 4){
                break;
            }
        }

        /*  Cédulas
        *
        *   70 % 100 = 70
        *   70 %  50 = 20
        *   20 %  20 =  0
        *
        *
        * */


        // Dividir pelo resto da divisão

        // Da pra melhorar essa parte
        int hunRest = number % 100;
        int hunDiv = number/100;

        int fiftyRest = hunRest % 50;
        int fiftyDiv = hunRest/50;

        int twentyRest = fiftyRest % 20;
        int twentyDiv = fiftyRest/20;

        int tenRest = twentyRest % 10;
        int tenDiv = twentyRest/10;

        int fiveRest = tenRest % 5;
        int fiveDiv = tenRest/5;

        int twoRest = fiveRest % 2;
        int twoDiv = fiveRest/2;


        System.out.println("Notas de cem: " + hunDiv);
        System.out.println("Notas de cinquenta: " + fiftyDiv);
        System.out.println("Notas de vinte: " + twentyDiv);
        System.out.println("Notas de dez: " + tenDiv);
        System.out.println("Notas de cinco: " + fiveDiv);
        System.out.println("Notas de dois: " + twoDiv);


    }
}