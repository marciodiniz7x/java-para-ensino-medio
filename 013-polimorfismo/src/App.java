import devflix.Filme;

public class App {
    public static void main(String[] args) throws Exception {
        Filme filme = new Filme("Lagoa Azul");
        filme.play();
        filme.play("Português");
    }
}
