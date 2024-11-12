import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {

        String caminhaArquivo = "D:/dev/JAVA/java-para-ensino-medio/020-leitura-de-arquivos/src/usuarios.txt";
        BufferedReader leitor = null;

        try {

            // código responsável por ler arquivo
            FileReader leitorArquivo = new FileReader(caminhaArquivo);
            leitor = new BufferedReader(leitorArquivo);

            String linha = leitor.readLine(); // ler linha
            System.out.println(linha);

            linha = leitor.readLine();
            System.out.println(linha);

            linha = leitor.readLine();
            System.out.println(linha);

        } catch (Exception erro) {
            // tratamento de erro
            System.out.println("Deu ruim!");
            System.out.println(erro.getMessage());
        }
    }
}
