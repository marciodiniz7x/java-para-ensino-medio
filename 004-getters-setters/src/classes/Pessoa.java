package classes;

public class Pessoa {
    private String nome = "José";
    private int idade;
    private double altura;

    // <modificador-acesso> <retorno> nomeDoMetodo()
    // pegarNome()
    public String getNome() {
        return nome;
    }

    // pegarIdade()
    public int getIdade() {
        return idade;
    }

    // pegarAltura()
    public double getAltura() {
        return altura;
    }

    // alterarNome()
    public void setNome(String nome) {
        // quando há mais de uma variável com o mesmo nome,  usa-se o ''this'' para mostrar para o JAVA que estamos nos referindo ao atributo desta classe em que estamos
        this.nome = nome;
    }

    // alterarIdade()
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // alterarAltura()
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
