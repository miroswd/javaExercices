/***
 * Input de valor
 * Mostrar o antecessor e sucessor
 */

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");

        int typedValue = input.nextInt();
        int predecessor = typedValue - 1;
        int successor = typedValue + 1;

        System.out.println("Valor digitado: " + typedValue + "\nAntecessor: " + predecessor + "\nSucessor: " + successor);
    }
}
