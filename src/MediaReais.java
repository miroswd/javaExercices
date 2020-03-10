/***
 * Input de 2 números reais
 * Média entre eles
 * Concatenar 'Média' com o valor obtido
 */

import java.util.Scanner;

public class MediaReais {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        float firstValue = input.nextFloat();

        System.out.print("Digite o valor 2: ");
        float secondValue = input.nextFloat();

        float average = (firstValue + secondValue)/2;
        System.out.println("Média: " + average);

    }
}
