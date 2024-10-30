package jogo;

public class Guerreiro extends Personagem {
    private String arma;

    public Guerreiro(String nome) {
        super(nome);
        setClasse("Guerreiro");
        setNivel(5);
        this.arma = "Espada de Artorias";
    }

    @Override
    public String toString() {
        String infoPersonagem = super.toString();
        String infoGuerreiro = String.format(" - Arma: %s", arma);
        return infoPersonagem + infoGuerreiro;
    }

    @Override
    public void atacarComArma() {
        System.out.println("O guerreiro atacou com " + arma + "!");
    }
    
}
