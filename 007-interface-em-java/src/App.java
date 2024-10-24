import classes.CalculadorArea;
import classes.Circulo;
import classes.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadradoPequeno = new Quadrado(5);
        Circulo circuloPequeno = new Circulo(2);
       
        CalculadorArea calculador = new CalculadorArea();

        System.out.println(calculador.somarAreas(quadradoPequeno, quadradoPequeno));

    }
}
