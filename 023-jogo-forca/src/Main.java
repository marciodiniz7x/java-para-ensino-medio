public class Main {
    public static void main(String[] args) throws Exception {
        var jogador = new Jogador("Márcio");
        var palavra = new Palavra();
        var jogo = new Jogo(palavra, jogador);

        jogo.iniciarJogo();
    }
}
