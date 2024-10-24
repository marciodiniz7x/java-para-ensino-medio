import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Array (vetor) -> com tamanho 5 posições
        String[] arrayEstatico = new String[5];
        arrayEstatico[0] = "Goku";
        arrayEstatico[1] = "Maria";
        arrayEstatico[2] = "João";
        arrayEstatico[3] = "Pedro";
        arrayEstatico[4] = "Ana Clara";

        // ArrayList<Tipo> nome = new ArrayList<Tipo>()
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Goku");
        arrayDinamico.add("Maria");
        arrayDinamico.add("João");
        arrayDinamico.add("Pedro");
        arrayDinamico.add("Ana Clara");

        // Array Estático
        System.out.println("Imprimindo o Array Estático");
        for( int indice = 0; indice < arrayEstatico.length; indice++) {
            System.out.println(arrayEstatico[indice]);
        }

        System.out.println("\nImprimindo o ArrayList:");

        for ( int indice = 0; indice < arrayDinamico.size(); indice++) {
            System.out.println(arrayDinamico.get(indice));
        }

    }
}
