package telefone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ligacao {
    private String numeroOrigem;
    private String numeroDestino;
    private String horarioLigacao;

    public Ligacao(String numeroOrigem, String numeroDestino) {
        this.numeroOrigem = numeroOrigem;
        this.numeroDestino = numeroDestino;
    }

    public void ligar() {
        System.out.println("Ligando para " + numeroDestino);
        System.out.println("Chamando...");
        System.out.println("O número está Ocupado");
        // dia/mês/ano horas:min:seg
        // dd/MM/YYYY HH:mm:ss
        DateTimeFormatter formatadorDeData = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        LocalDateTime horarioAgora = LocalDateTime.now();
        horarioLigacao = formatadorDeData.format(horarioAgora);
    }

    public String getNumeroOrigem() {
        return numeroOrigem;
    }

    @Override
    public String toString() {
        String informacao = String.format("Origem: %s \tDestino: %s \tHorario: %s", 
        numeroOrigem,
        numeroDestino,
        horarioLigacao
        );
        return informacao;
    }

    public void setNumeroOrigem(String numeroOrigem) {
        this.numeroOrigem = numeroOrigem;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }
    
 
}
