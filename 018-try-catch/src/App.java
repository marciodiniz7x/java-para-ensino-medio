public class App {
    public static void main(String[] args) throws Exception {

        int[] numeros = new int[] {20, 30, 40, 100};
        int[] peso = new int[] {2, 3, 4};

        

        try { // try -> tentar
            // tenta executar
            for (int i = 0; i < 4; i++) {
                int resultado = numeros[i] / peso[i];
                System.out.printf("%d / %d = %d \n", numeros[i], peso[i], resultado);
            }
            System.out.println("Números: ");
            System.out.println(numeros[5]);
        } catch(Exception erro) { // catch -> capturar
            // trata os erros capturados no bloco try
            // imprimir no console o erro ocorrido
            // criar um arquivo de log
            System.err.println("Erro da exceção: " + erro.getMessage());
        }
        System.out.println("Mensagem final");

    }
}
