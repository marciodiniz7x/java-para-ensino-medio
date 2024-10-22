import classes.Conta;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // classe Pessoa
        Pessoa pessoa = new Pessoa();

        // se ao invés de usar get e set eu tivesse usado os métodos que criei pegarNome e AlterarNome usaria:
        // Pessoa pessoa = new Pessoa();
        // pessoa.alterarNome("Bob Esponja");
        // pessoa.alterarAltura(1.80);
        // pessoa.alterarIdade(18);

        // Porém usamos o padrão reservado do java para isso que são o get e o set, portanto fazemos:

        // modificarVariavel -> setVariavel
        // pegarVariavel -> getVariavel
        pessoa.setNome("Bob Esponja");
        pessoa.setAltura(1.80);
        pessoa.setIdade(18);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura" + pessoa.getAltura());

        // classe Conta
        Conta conta = new Conta();
        System.out.println(conta.getSaldo());

        conta.depositar(+100);
        System.out.println(conta.getSaldo());
    }
}
