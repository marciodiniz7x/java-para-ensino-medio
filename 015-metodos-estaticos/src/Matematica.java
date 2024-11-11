public class Matematica {

    private static double valorPI = 3.14;

    public static int somar(int numA, int numB) {
        return numA + numB;
    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaCirculo(double raio) {
        // PI * raio  * raio
        double area = valorPI * raio * raio;
        return area;
    }

    public double calcularDobrAreaCirculo(double raio) {
        double area = calcularAreaCirculo(raio);
        return area;
    }
}
