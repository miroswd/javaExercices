/***
 *  Input de 4 valores INTEIROS
 *  Média ponderada
 *  Pesos de 1 a 4
 */

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Digite o valor 1: ");
        int firstValue =  input.nextInt();

        System.out.print("Digite o valor 2: ");
        int secondValue = input.nextInt();

        System.out.print("Digite o valor 3: ");
        int thirdValue = input.nextInt();

        System.out.print("Digite o valor 4: ");
        int fourthValue = input.nextInt();

        // Average
        float average = (firstValue * 1 + secondValue * 2 + thirdValue * 3 + fourthValue * 4)/ (1 + 2 + 3 + 4);

        // Outputs
        System.out.println("Média ponderada: " + average);


    }
}
