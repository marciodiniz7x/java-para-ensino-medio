import jogo.Arqueiro;
import jogo.Guerreiro;

public class App {
    public static void main(String[] args) throws Exception {

        Guerreiro guerreiro = new Guerreiro("Artorias");
        System.out.println(guerreiro);
        guerreiro.atacarComArma();
        guerreiro.atacarSemArma();

        Arqueiro arqueiro = new Arqueiro("Varus");
        System.out.println(arqueiro);
        arqueiro.atacarComArma();
        arqueiro.atacarSemArma();

    }
}
