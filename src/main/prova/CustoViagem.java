import java.util.Scanner;

public class CustoViagem {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Distância da viagem: 360 km");
        System.out.println("Consumo do carro: 12 km por litro");

        System.out.println("Qual o preço do combustível?");
        double precoCombustivel = teclado.nextDouble();

        double litrosNecessarios = 360 / 12.0;
        double custoTotal = litrosNecessarios * precoCombustivel;

        System.out.println("Litros necessários: " + litrosNecessarios);
        System.out.println("Custo total da viagem: R$ " + custoTotal);

        teclado.close();
    }
}
