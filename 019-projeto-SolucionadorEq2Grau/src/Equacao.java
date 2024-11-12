public class Equacao {

    // coeficientes da equação
    private int a;
    private int b;
    private int c;

    // raízes da equação
    private double x1;
    private double x2;

    public Equacao(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        calcularRaizes();
    }

    // fórmula de Bhaskara
    public void calcularRaizes() {
        double delta = (b * b) - (4 * a * c);
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
    }

    // getters para as raízes da equação
    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
}
