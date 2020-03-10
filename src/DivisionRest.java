/***
 * Input valores A e B
 * Calcular o resto da divisão
 */

import java.util.Scanner;

public class DivisionRest {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Insira o valor A: ");
        int valueA = input.nextInt();

        System.out.print("Insira o valor B: ");
        int valueB = input.nextInt();

        float rest = valueA % valueB;

        System.out.println("Resto da divisião: " + rest);
    }
}
