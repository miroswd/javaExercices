/***
 * Input de um número com 4 dígitos
 * Separar em MCDU
 */

import java.util.Scanner;

public class QuatroDigitos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número de 4 dígitos: ");
        int number = input.nextInt();

        String numberStr = Integer.toString(number); // Convertendo inteiro para string

        // Se tiver menos que 4 algarismos, acrescentar um zero na frente
        for (int i =0; numberStr.length() < 4; i++){
            numberStr = "0" + numberStr;;
        }

        // Impedindo o uso de mais de 4 algarismos
        while (numberStr.length() > 4 ){
            System.out.print("\nO valor inserido é inválido. \nO número deve ter no máximo 4 algarismos:");
            number = input.nextInt();
            numberStr = Integer.toString(number);

            if (numberStr.length() <= 4){
                break;
            }
        };

        // Identification
        int thousand = Integer.parseInt(numberStr.substring(0,1)); // Convertendo string para inteiro
        int hundred = Integer.parseInt(numberStr.substring(1,2));
        int ten = Integer.parseInt(numberStr.substring(2,3));
        int one = Integer.parseInt(numberStr.substring(3,4));

        int[] digits = {thousand,hundred,ten,one};
        String[] units = {"Milhares","Centenas","Dezenas","Unidades"};

        // Output
        for (int i = 0; i < units.length; i++) {
            // Removendo o plural
            if (units[i] == "Milhares" && digits[i] == 1){
                units[i] = "Milhar";
            } else if (digits[i] == 1 ){
                int len = units[i].length();
                units[i] = units[i].substring(0, len - 1);
            }
            System.out.println(digits[i] + " " + units[i]);
        }
    }
}
