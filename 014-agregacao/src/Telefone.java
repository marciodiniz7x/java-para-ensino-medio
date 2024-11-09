public class Telefone {
    private String numeroChip;
    private Contatos contatos;
    

    public Telefone(String numeString) {
        this.numeroChip = numeString;
        this.contatos = new Contatos();
    }

    public Contatos getContatos() {
        return contatos;
    }


    public String getNumeroChip() {
        return numeroChip;
    }
    
}
