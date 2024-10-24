package classes;

public class Pessoa {

    // Atributos da classe
    private String nome;
    private int idade;
    private float altura;

    // <tipo-de-visibilidade> <nomeDaClasse()>
    public Pessoa(String nome, int idade, float altura) {
        System.out.println("Pessoa criada");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

    }

    public void imprimirDados() {
        System.out.format("Nome: %s \nIdade: %d \nAltura: %.2f", nome, idade, altura);
    }

    //Metodos getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
