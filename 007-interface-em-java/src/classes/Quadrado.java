package classes;

public class Quadrado implements FiguraGeometrica {
    
    // Atributo
    private int lado;

    // Construtor
    public Quadrado(int lado) {
        this.lado = lado;
    }

    // Método específico
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    // Getters e setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

}
