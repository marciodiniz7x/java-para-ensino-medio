package animais;

public class Pombo extends Animal {
    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        this.cartasEnviadas = 10;
    }

    public void voar() {
        System.out.printf("\n%s voou", getNome());
    }

    public void fazerPruh() {
        System.out.printf("\n%s fez Pruuuuuuuh", getNome());
    }

    public void enviarCarta() {
        System.out.printf("\n%s enviou uma carta", getNome());
        cartasEnviadas++;
    }

    public int getCartasEnviadas() {
        System.out.println("\nCartas enviadas: " + cartasEnviadas);
        return cartasEnviadas;
    }    
    
}
