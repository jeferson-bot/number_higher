
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("numero 1: ");
        int numero1 = Integer.parseInt(teclado.nextLine());

        System.out.print("numero 2: ");
        int numero2 = Integer.parseInt(teclado.nextLine());

        System.out.println(Math.max(numero1, numero2));
    }
}


