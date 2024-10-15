import java.util.Random;

public class Personagem {

    String nome; 
    int nivel;
    int forca;
    int mente;
    int habilidade1;

    // void -> não está retornando nada
    void mostrarStatus() {

        System.out.format("Personagem: %s \nNível: %d \nForça: %d \nInteligência: %d \n\n", nome, nivel, forca, mente);

    }

    int calcularDano() {

        // gerar números aleatórios
        Random gerador = new Random();
        // 1 ... 20
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;

        return dano;
    }

    int calcularMagia() {

        // gerar números aleatórios
        Random gerador = new Random();
        // 1 ... 20
        int dado20Faces = 1 + gerador.nextInt(19);
        int magia = mente + dado20Faces;

        return magia;
    }

    // método usando parâmetro (String alvo) que receberá um argumento
    void atacar(String alvo, String habilidade) {

        int danoCausado = calcularDano();

        if (habilidade.length() == 0) {
            System.out.format("%s atacou um %s e causou %d de dano físico.\n\n", nome, alvo, danoCausado);
        } else {
            System.out.format("%s usou %s contra um %s e causou %d de dano físico.\n\n", nome, habilidade, alvo, habilidade1);
        }

    }

    void usarFeitico(String alvo, String habilidade) {

        int danoCausado = calcularMagia();

        if (habilidade.length() == 0) {
            System.out.format("%s atacou um %s e causou %d de dano mágico.\n\n", nome, alvo, danoCausado);
        } else {
            System.out.format("%s usou %s contra um %s e causou %d de dano mágico.\n\n", nome, habilidade, alvo, habilidade1);
        }
        
    }
}
