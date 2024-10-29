package animais;

public class Cachorro extends Animal {
    public void latir() {
        System.out.printf("\n%s comeu", getNome());
    }

    public void lamber() {
        System.out.printf("\n%s lambeu", getNome());
    }
}
