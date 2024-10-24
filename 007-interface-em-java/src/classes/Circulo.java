package classes;

public class Circulo implements FiguraGeometrica {

    // Atributos
    private int raio;

    // Contrutor
    public Circulo(int raio) {
        this.raio = raio;
    }

    // Métodos especificos da classe
    public double calcularArea() {
        // area = PI * R²
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    // Métodos getters e setters
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
}
