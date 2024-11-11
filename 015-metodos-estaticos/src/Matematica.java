public class Matematica {
    public int somar(int numA, int numB) {
        return numA + numB;
    }

    public double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public double calcularAreaCirculo(double raio) {
        // PI * raio  * raio
        double area = 3.14 * raio * raio;
        return area;
    }
}
