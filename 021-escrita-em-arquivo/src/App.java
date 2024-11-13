import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {

        String caminhoArquivo = "arquivo.txt";
        boolean acrescentarArquivo = true;

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo, acrescentarArquivo))) {

            escritor.write("Bom dia! \nTudo certo? \n");
            escritor.write("Fim do documento. \n");

            // Encerrar comunicação com arquivo aberto
        escritor.close();
        } catch (Exception erro) {
            System.out.println("Não foi possível gravar o arquivo");
            erro.printStackTrace();
        }

    }
}
