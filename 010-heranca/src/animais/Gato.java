package animais;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    public void miar() {
        System.out.printf("\n%s miou", getNome());
    }
}