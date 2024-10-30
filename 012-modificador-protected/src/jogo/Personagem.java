package jogo;
import java.util.Random;

public abstract class Personagem {

    public abstract void atacar();

    // Protected deixa o método visível na classe em que foi implementado e em classes herdeiras
    protected int rolarDado() {
        Random gerador = new Random();
        int numero = 1 + gerador.nextInt(6);
        return numero;
    }
}
