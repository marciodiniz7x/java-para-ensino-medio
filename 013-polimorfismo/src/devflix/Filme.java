package devflix;

public class Filme extends Video {
    private String audio;
    private String legenda;

    public Filme(String nome) {
        super(nome);
        this.audio = "Português";
        this.legenda = "Nenhuma";
    }

    @Override
    public void play() {
        System.out.println("Play: filme " + getNome());
    }

    public void play(String audio) {
        this.audio = audio;
        
        if(audio == "Português") {
            this.legenda = "Nenhuma";
        } else {
            this.legenda = "Português";
        }

        System.out.println("Play: filme " + toString());
    }

    public void play(String audio, String legenda) {
        this.audio = audio;
        this.legenda = legenda;
        System.out.println("Play: filme " + toString());
    }

    @Override
    public String toString() {
        String informacao = String.format("Filme: %s (audio: %s, legenda: %s)", getNome(), audio, legenda);
        return informacao;
    }

    // Getters e Setters
    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    
    
}
