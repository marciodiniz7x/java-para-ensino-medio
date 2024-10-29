import animais.Cachorro;
import animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Criando o objeto cachorro -> Instanciando a classe Cachorro
        Cachorro cachorro = new Cachorro("Fenrir");
        cachorro.comer();
        cachorro.beber();
        cachorro.latir();

        // Criando o objeto gato -> Instanciando a classe Gato
        Gato gato = new Gato("Snorlax");
        gato.beber();
        gato.comer();
        gato.miar();
        
    }
}
