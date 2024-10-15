public class App {
    public static void main(String[] args) throws Exception {
        // Declarando um objeto do tipo Celular = Instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "iOS";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy A15";
        celularB.tamanhoTela = 6.5f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC;
        celularC = new Celular();
        celularC.nome = "Xiaomi Mi A1";
        celularC.tamanhoTela = 5.5f;
        celularC.espacoArmazenamento = 64;
        celularC.sistemaOperacional = "Android One";

        System.out.format("Celular %s com tela de %.1f, com %dGB e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);

        System.out.format("Celular %s com tela de %.1f, com %dGB e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);

        System.out.format("Celular %s com tela de %.1f, com %dGB e SO %s", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);

    }
}
