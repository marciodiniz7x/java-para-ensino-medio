public class App {
    public static void main(String[] args) throws Exception {
        Personagem heroi = new Personagem();
        heroi.nome = "Hercules";
        heroi.nivel = 2;
        heroi.forca = 16;
        heroi.mente = 4;
        heroi.habilidade1 = heroi.forca * 2;

        Personagem mago = new Personagem();
        mago.nome = "Merlyn";
        mago.nivel = 5;
        mago.forca = 4;
        mago.mente = 16;
        mago.habilidade1 = mago.mente * 2;

        heroi.mostrarStatus();
        mago.mostrarStatus();

        // chamando o método e passando um argumento ("Goblin") que será o alvo
        heroi.atacar("Goblin", "");
        mago.usarFeitico("Hercules", "Cura");

        // Chamando o método bau da classe Tesouro
        String tesouro = Tesouro.bau();
        System.out.println("Você abriu um baú e encontrou: " + tesouro + "\n\n");

    }
}
