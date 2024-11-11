package telefone;

import java.util.ArrayList;

public class Contatos {
    private ArrayList<Contato> contatos;

    public Contatos() {
        this.contatos = new ArrayList<Contato>();
    }

    public void adicionar(String nome, String numero) {
        Contato novoContato = new Contato(nome, numero);
        contatos.add(novoContato);
    }

    public void adicionar(Contato novoContato) {
        contatos.add(novoContato);
    }

    public Contatos buscar(String palavraChave) {
        // palavraChave = "Lu"
        Contatos contatosFiltrados = new Contatos();
        String palavraChaveMinusculo = palavraChave.toLowerCase();
        for (Contato contato : contatos) {
            // Esse contato começa com a minha palavraChave?
            String nomeContatoMinusculo = contato.getNome().toLowerCase();
            if(nomeContatoMinusculo.startsWith(palavraChaveMinusculo)) {
                contatosFiltrados.adicionar(contato);
            }
            // Não -> pular para o próximo contato da lista
        }
        return contatosFiltrados;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        String informacao = "Contatos:\n";
        for (Contato contato : contatos) {
            informacao = informacao + contato.toString() + "\n";
        }
        return informacao;
    }
    
}
