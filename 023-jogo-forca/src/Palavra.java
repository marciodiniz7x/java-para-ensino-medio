import java.util.Arrays;
import java.util.List;

public class Palavra {
    private List<String> palavras = Arrays.asList("faca", "garfo", "colher", "prato", "tigela", "panela");

    private String palavraSecreta;
    private String palavraComChute;

    public List<String> getPalavras() {
        return palavras;
    }

    public void setPalavras(List<String> palavras) {
        this.palavras = palavras;
    }

    public String getPalavraSecreta() {
        return palavraSecreta;
    }

    public void setPalavraSecreta(String palavraSecreta) {
        this.palavraSecreta = palavraSecreta;
    }

    public String getPalavraComChute() {
        return palavraComChute;
    }

    public void setPalavraComChute(String palavraComChute) {
        this.palavraComChute = palavraComChute;
    }

}
