public class App {
    static int soma = 0;
    private static void imprimirMensagem() {
        System.out.println("Olá, mundo!");
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Soma: " + soma);
        imprimirMensagem();

        Carro ferrari = new Carro("Ferrari", 2024);
        Carro fusca = new Carro("Fusca", 1999);
        fusca.setNome("Fusca branco");

        ferrari.anoCompra = 2007;
        fusca.anoCompra = 2020;
        Carro.anoCompra = 2077;

        System.out.println(ferrari.getNome());
        System.out.println(ferrari.anoCompra);
        System.out.println(fusca.getNome());
        System.out.println(fusca.anoCompra);

    }
}
