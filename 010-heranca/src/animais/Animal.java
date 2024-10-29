package animais;

public class Animal {
    private String nome;
    // <nome> comeu
    String mensagem = String.format("%s comeu", nome);

    public void comer() {
        System.out.println(mensagem);
    }

    public void beber() {
        System.out.println(mensagem);
    }
    
}
