package jogo;

public class Arqueiro extends Personagem {
    private String arma;

    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(2);
        this.arma  = "Arco Longo";
    }

    @Override
    public String toString() {
        String infoPersonagem = super.toString();
        String infoArqueiro = String.format(" - Arma: %s", arma);
        return infoPersonagem + infoArqueiro;
    }

    @Override
    public void atacar() {
        System.out.println("O arqueiro atacou com " + arma + "!");
    }
    
}
