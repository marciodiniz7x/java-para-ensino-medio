public class App {
    public static void main(String[] args) throws Exception {
        Serie serieQualquer = new Serie("The Last of Us", 1, 2023);
        serieQualquer.pegarInformacoes();

        System.out.println(serieQualquer.pegarInformacoes());

        // Imprime NomeDaClasse
        System.out.println(serieQualquer);
    }
}
