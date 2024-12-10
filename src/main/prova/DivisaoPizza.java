import java.util.Scanner;

public class DivisaoPizza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantars pessoas vão comer pizza?");
        int pessoas = teclado.nextInt();

        System.out.println("Quantas fatias tem a pizza?");
        int fatias = teclado.nextInt();

        int fatiasPorPessoa = fatias / pessoas;
        int fatiasSobram = fatias % pessoas;

        System.out.println("Cada pessoa vai receber " + fatiasPorPessoa + " fatias.");

        if (fatiasSobram > 0) {
            System.out.println("Vai sobrar " + fatiasSobram + " fatias.");
            System.out.println("Precisamos de mais " + (pessoas - fatiasSobram) + " fatias para dividir igual.");
        }

        teclado.close();
    }
}