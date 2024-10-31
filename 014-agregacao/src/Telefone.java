import java.util.ArrayList;

public class Telefone {
    private String numeroChip;
    private ArrayList<Contato> contatos;

    public Telefone(String numeString) {
        this.numeroChip = numeString;
        this.contatos = new ArrayList<Contato>();
    }
}
