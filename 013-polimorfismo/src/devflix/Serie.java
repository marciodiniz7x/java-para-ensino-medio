package devflix;

public class Serie extends Filme{
    private int temporadas;
    private int episodioPorTemporada;
    private int episodioAtual;
    private int temporadaAtual;

    public Serie(String nome, int temporadas, int episodioPorTemporada) {
        super(nome);
        this.temporadas = temporadas;
        this.episodioPorTemporada = episodioPorTemporada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    }
  
    public void play(int temporada, int episodio) {

        if (validarEpisodio(temporada, episodio) == true) {
            this.temporadaAtual = temporada;
            this.episodioAtual = episodio;
            System.out.println("Play: " + toString());
        } else {
            System.err.println("Episodio inválido");
        }
        
    }

    private boolean validarEpisodio(int temporada, int episodio) {
        if (temporada == 0 || episodio == 0)
            return false;
        
        if (temporada > temporadas || episodio > episodioPorTemporada)
            return false;

        return true;
       
    }

    // Métodos específicos da classe

    // Getters e Setters
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getEpisodioAtual() {
        return episodioAtual;
    }

    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }

    @Override
    public String toString() {
        // Serie <nome> <temporada> x0<episodio>
        // Serie: The Witcher 1x01

        String informacao = String.format("Serie: %s %dx%02d (audio: %s, legenda: %s)", 
        getNome(), 
        temporadaAtual, 
        episodioAtual, 
        getAudio(), 
        getLegenda());

        return informacao;
    }

}
