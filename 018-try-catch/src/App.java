public class App {
    public static void main(String[] args) throws Exception {

        try { // try -> tentar
            // tenta executar
            int[] numeros = new int[] {10, 20, 30};
            System.out.println("Números: ");
            System.out.println(numeros[5]);
        } catch(Exception erro) { // catch -> capturar
            // trata os erros capturados no bloco try
            // imprimir no console o erro ocorrido
            // criar um arquivo de log
            System.out.println(erro.getMessage());
        }
        System.out.println("Mensagem final");

    }
}
