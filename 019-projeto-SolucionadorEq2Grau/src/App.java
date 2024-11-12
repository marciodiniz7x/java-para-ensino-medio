public class App {
    public static void main(String[] args) throws Exception {
        // forneça os valores de a, b e c
        Equacao equacao = new Equacao(1, -3, 2);

        // o programa irá retornar a solução da equação
        System.out.println("x1 = " + equacao.getX1());
        System.out.println("x2 = " + equacao.getX2());
    }
}
