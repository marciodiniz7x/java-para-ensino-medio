package classes;

public class Pessoa {

    // Atributos da classe
    private String nome;
    private int idade;
    private float altura;

    // <tipo-de-visibilidade> <nomeDaClasse()>
    public Pessoa() {
        System.out.println("Pessoa criada");
        altura = 1.79f;
        nome = "Naruto";
        idade = 16;
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
