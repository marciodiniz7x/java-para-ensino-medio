package devflix;

public class Filme extends Video {

    public Filme(String nome) {
        super(nome);
    }

    @Override
    public void play() {
        System.out.println("Play: filme " + getNome());
    }

    public void play(String idioma) {
        System.out.println("Play: filme " + getNome() + " no idioma " + idioma);
    }
    
}
