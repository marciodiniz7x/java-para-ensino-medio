import java.util.Scanner;

public class Jogo {
    private final Palavra palavra;
    private final Jogador jogador;

    public Jogo(Palavra palavra, Jogador jogador) {
        this.palavra = palavra;
        this.jogador = jogador;
    }
 
    public void iniciarJogo() {

        var numeroChutes = 10;

        var scanner = new Scanner(System.in);

        System.out.println("Olá" + this.jogador.getNome() + ", bem-vindo ao Jogo da Forca!");
        System.out.println("Você tem " + numeroChutes + " chutes para adivinhar a palavra secreta.");
        System.out.println(this.palavra.getPalavraComChute() + "\n");
    }
}
