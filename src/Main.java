import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.print("numero 1: ");
        int numero1 = Integer.parseInt(teclado.nextLine());

        System.out.print("numero 2: ");
        int numero2 = Integer.parseInt(teclado.nextLine());

        if ( numero1 >= numero2 )
        {
                System.out.println( numero1 );
        }

        else
        {
            System.out.println( numero2 );
        }







    }

}


