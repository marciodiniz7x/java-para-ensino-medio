import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String caminhoArquivo = "D:/dev/JAVA/java-para-ensino-medio/020-leitura-de-arquivos/src/usuarios.txt";
        

        try {
            // String resultado = arquivo.ler(caminhoArquivo);
            // System.out.println(resultado);
            Path caminhos = Paths.get(caminhoArquivo);
            List<String> resultadoLista = Files.readAllLines(caminhos); // ler todas as linhas
            String conteudo = String.join("\n", resultadoLista);

            System.out.println(conteudo);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Houve um problema na leitura do arquivo");
        }
        
    }
}
