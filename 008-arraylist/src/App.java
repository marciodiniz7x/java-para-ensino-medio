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

        // Imprime o array estático
        for( int indice = 0; indice < arrayEstatico.length; indice++) {
            System.out.println(arrayEstatico[indice]);
        }

        System.out.println("Primeira posição: " + arrayDinamico.get(0));

        // Exibe o último elemento do arrayList
        int ultimoIndice = arrayDinamico.size() - 1;
        System.out.println("\nÚltima posição: " + arrayDinamico.get(ultimoIndice));

        // Remove elemento do arrayList
        arrayDinamico.remove(1);
        System.out.println("Remover Maria");

        // limpa o arrayList
        arrayDinamico.clear(); 
        System.out.println();

        System.out.println("\nImprimindo o ArrayList:");

        // Imprime todo o arrayList
        for ( int indice = 0; indice < arrayDinamico.size(); indice++) {
            System.out.println(arrayDinamico.get(indice));
        }

        // Faz o mesmo processo da linha 46-48 usando for each
        for (String nome : arrayDinamico) {
            System.out.println(nome);
        }

    }
}
