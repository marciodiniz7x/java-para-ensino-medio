import jogo.Arqueiro;
import jogo.Personagem;

public class App {
    public static void main(String[] args) throws Exception {
        Personagem personagem = new Personagem("Joao");
        System.out.println(personagem);

        Arqueiro arqueiro = new Arqueiro("Varus");
        System.out.println(arqueiro);
    }
}
