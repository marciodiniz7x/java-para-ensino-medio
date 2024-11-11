public class Matematica {
    public static int somar(int numA, int numB) {
        return numA + numB;
    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaCirculo(double raio) {
        // PI * raio  * raio
        double area = 3.14 * raio * raio;
        return area;
    }
}
