public class App {
    public static void main(String[] args) throws Exception {
        Pitagoras pitagoras = new Pitagoras();
        pitagoras.setCatetoOposto(4);
        pitagoras.setCatetoAdj(3);

        System.out.println("Hipotenusa = " + pitagoras.calcularHipotenusa());
    }
}
