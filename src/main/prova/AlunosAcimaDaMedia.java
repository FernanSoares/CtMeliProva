import java.util.Scanner;

public class AlunosAcimaDaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos alunos você vai cadastrar?");
        int total = teclado.nextInt();

        String[] nomes = new String[total];
        double[] notas = new double[total];

        for (int i = 0; i < total; i++) {
            System.out.println("Nome do aluno:");
            nomes[i] = teclado.next();
            System.out.println("Nota do aluno:");
            notas[i] = teclado.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / total;

        System.out.println("\nAlunos acima da média:");
        for (int i = 0; i < total; i++) {
            if (notas[i] > media) {
                System.out.println(nomes[i] + " - Nota: " + notas[i]);
            }
        }

        teclado.close();
    }
}