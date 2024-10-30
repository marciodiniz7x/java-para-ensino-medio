package jogo;

public class Guerreiro extends Personagem {

    @Override
    public void atacar() {
        int valorDado6Faces = this.rolarDado();
        System.out.printf("Você tirou um *%s* no dado: ", valorDado6Faces);
        if(valorDado6Faces < 3) {
            System.out.println("Nãããoo! O guerreiro Errou o Ataque!");
        } else if (valorDado6Faces == 6) {
            System.out.println("INCRÍVEL!!! O guerreiro Acertou um Golpe Especial!!!");
        } else {
            System.out.println("Issooo! O guerreiro Acertou o Inimigo!");
        }
    }
    
}
