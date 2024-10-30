public class Serie {
    private String nome;
    private int temporadas;
    private int ano;

    // Construtor
    public Serie(String nome, int temporadas, int ano) {
        this.nome = nome;
        this.temporadas = temporadas;
        this.ano = ano;
    }

    // Métodos específicos da classe
    public void imprimirInformacoes() {
        // Nome: The... (2023) - 1 temporada(s)
        System.out.printf("Nome: %s (%d) - %d temporada(s)", nome, ano, temporadas);
    }

    // Métodos Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    
}
