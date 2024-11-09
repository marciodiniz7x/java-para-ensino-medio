

import telefone.Contato;
import telefone.Contatos;
import telefone.Telefone;

public class App {
    public static void main(String[] args) throws Exception {
        Telefone telefone = new Telefone("4002 8922");

        Contato contatoA = new Contato("Márcio", "90901234");
        Contato contatoB = new Contato("Lucas", "90905678");
        Contato contatoC = new Contato("Patrícia", "90904321");
        Contato contatoD = new Contato("Luanny", "99090000");

        Contatos telefoneContatos = telefone.getContatos();
        telefoneContatos.adicionar(contatoA);
        telefoneContatos.adicionar(contatoB);
        telefoneContatos.adicionar(contatoC);
        telefoneContatos.adicionar(contatoD);
        
        System.out.println(telefoneContatos);

        System.out.println("Contatos filtrados: ");
        System.out.println(telefoneContatos.buscar("lu"));

    }
}
