import animais.Cachorro;
import animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Luciano");
        cachorro.comer();
        cachorro.beber();
        cachorro.latir();

        Gato gato = new Gato();
        gato.setNome("Lula");
        gato.beber();
        gato.beber();
        gato.miar();
        
    }
}
