package animais;

public class Animal {
    private String nome;


    public void comer() {
        System.out.printf("\n%s comeu", nome);
    }

    public void beber() {
        System.out.printf("\n%s bebeu", nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
