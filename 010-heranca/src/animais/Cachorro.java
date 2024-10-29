package animais;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.printf("\n%s latiu", getNome());
    }

    public void lamber() {
        System.out.printf("\n%s lambeu", getNome());
    }
}
