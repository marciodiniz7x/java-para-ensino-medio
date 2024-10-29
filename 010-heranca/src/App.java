import animais.Cachorro;
import animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Criando o objeto cachorro -> Instanciando a classe Cachorro
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Luciano");
        cachorro.comer();
        cachorro.beber();
        cachorro.latir();

        // Criando o objeto gato -> Instanciando a classe Gato
        Gato gato = new Gato();
        gato.setNome("Lula");
        gato.beber();
        gato.beber();
        gato.miar();
        
    }
}
