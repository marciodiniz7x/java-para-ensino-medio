package animais;

import java.util.Random;

public class Dragao extends Animal {

    private int batalhasVencidas;

    public Dragao(String nome) {
        super(nome);
        this.batalhasVencidas = 510;
    }

    public void soltarFogo() {
        System.out.printf("\n%s soltou fogo", getNome());
    }

    public void voar() {
        System.out.printf("\n%s voou", getNome());
    }

    public boolean lutar() {
        Random random = new Random();
        boolean venceu = random.nextBoolean();

        if(venceu) {
            batalhasVencidas++;
            System.out.printf("\n\n%s lutou e Venceu a batalha!", getNome());
        } else {
            System.out.printf("\n%s lutou e Perdeu a batalha!", getNome());
        }
    
        System.out.println("\nBatalhas vencidas: " + batalhasVencidas);

        return venceu;
        
    }
    
    
}
