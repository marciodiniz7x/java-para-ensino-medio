public class Login {
    // Constantes devem ser:
    // static
    // nome em um padrão snake case (SNAKE_CASE)
    // final
    public static final int TAMANHO_MINIMO_SENHA = 7;

    public void verificarSenha(String senha) {
        
        if ( senha.length() >= TAMANHO_MINIMO_SENHA ) {
            System.out.println("Senha válida");
        } else {
            System.err.println("Senha inválida");
        }
    } 
}
