import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Matematica matematica = new Matematica();
        
        int[] numeros = new int[] {20, 30, 40, 100};
        int[] peso = new int[] {2, 0, 4};

        for (int i = 0; i < 4; i++) {
            
            try { // try -> tentar

                // tenta executar
                matematica.dividir(numeros[i], peso[i]);
                int resultado = numeros[i] / peso[i];
                System.out.printf("%d / %d = %d \n", numeros[i], peso[i], resultado);  
                System.out.println("Números: ");
                System.out.println(numeros[5]);

            } catch(ArithmeticException erro) { // trata erros de calculos matemáticos
                

                // mostra o erro via caixa de diálogo
                JOptionPane.showMessageDialog(null, "Erro de cálculo" + erro.getMessage());

            } catch(ArrayIndexOutOfBoundsException erro) { // tratar erros de tamanho do vetor
                

                System.out.println("Erro de vetor: " + erro.getMessage());

            } catch (Exception erro) { // trata erros gerais
                

                System.out.println("Erro genérico");        
        
            } finally { // finalmente ->

                // SEMPRE SERÁ EXECUTADO
                System.out.println("Vou ser executado independente de ter dado erro ou não");

            }

        }
        
        System.out.println("Mensagem final");

    }
}
