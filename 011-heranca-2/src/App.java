import jogo.Arqueiro;
import jogo.Personagem;

public class App {
    public static void main(String[] args) throws Exception {
        Personagem personagem = new Personagem("Joao");
        System.out.println(personagem);
        personagem.atacar();

        Arqueiro arqueiro = new Arqueiro("Varus");
        System.out.println(arqueiro);
        arqueiro.atacar();
    }
}
