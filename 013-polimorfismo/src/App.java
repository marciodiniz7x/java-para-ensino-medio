import devflix.Filme;
import devflix.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        Filme filme = new Filme("Lagoa Azul");
        filme.play();
        filme.play("Japonês");
        filme.play("Inglês", "Árabe");

        Serie serie = new Serie("The Withcer", 2, 10);
        serie.play(1, 8);
    }
}
