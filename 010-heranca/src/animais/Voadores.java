package animais;

public class Voadores extends Animal{

    public Voadores(String nome) {
        super(nome);
    }

    public void voar() {
        System.out.printf("\n%s voou", getNome());
    }
    
}
