import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Vou verificar se um número é primo!");
        System.out.println("Digite um número:");
        int numero = teclado.nextInt();

        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(numero + " é primo");
        } else {
            System.out.println(numero + " não é primo");
        }

        teclado.close();
    }
}