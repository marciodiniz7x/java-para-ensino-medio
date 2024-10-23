import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
     
        System.out.format("Nome: %s \nIdade: %d \nAltura: %.2f", 
        pessoa.getNome(), 
        pessoa.getIdade(), 
        pessoa.getAltura()
        );
    }
}
