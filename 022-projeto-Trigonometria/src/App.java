import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Pitagoras pitagoras = new Pitagoras();
        try (Scanner scanner = new Scanner(System.in)) {

            // Solicita os valores dos catetos ao usuário
            System.out.println("Digite o valor do Cateto Oposto:");
            pitagoras.setCatetoOposto(scanner.nextDouble());

            System.out.println("Digite o valor do Cateto Adjascente:");
            pitagoras.setCatetoAdj(scanner.nextDouble());

            // Retorna o resultado
            System.out.printf("Hipotenusa = %.1f ", pitagoras.calcularHipotenusa());

        // Se o usuário digitar um caractere inválido
        } catch (Exception erro) {

            System.out.println("Você digitou um valor inválido");

        }
    }
}
