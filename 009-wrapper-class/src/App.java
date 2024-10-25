import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando arrayList de strings
        ArrayList<String> filmes = new ArrayList<String>();
        filmes.add("Vingadores");

        // Porém não posso criar arrayList de tipos primitivos como int preciso criar usando classes

        // Cada tipo primitivo possui uma classe chamada Wrapper Class, que são:

        /*
            Tipo Primitivo -> Wrapper Class
            int            -> Integer
            float          -> Float
            double         -> Double
            char           -> Character
         */

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);

        // É possível definir variáveis usando Wrapper Class
        Integer idade = 14;
        Character inicial= 'A';
        Double altura = 1.60;

        System.out.format("%d, %s, %.2f \n\n", idade, inicial, altura);

        Pessoa joao = new Pessoa("João", 20);
        Pessoa maria = new Pessoa("Maria", 16);
        Pessoa pedro = new Pessoa("Pedro", 70);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(pedro);
        pessoas.add(maria);
        pessoas.add(joao);

        System.out.println("Pessoas do arrayList:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        // Bônus: vamos preencher o arrayList numeros
        numeros.add(20);
        numeros.add(10);
        numeros.add(2);
        numeros.add(30);
        numeros.add(20000);
        numeros.add(21);
        numeros.add(18);

        // Podemos ordenar importando a classe Collections

        // sort -> ordenar de forma crescente
        Collections.sort(numeros);

        // Imprimindo o arrayList crescente
        System.out.println("ArrayList em ordem crescente:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Ordenando em forma decrescente
        Collections.sort(numeros, Collections.reverseOrder());

        // Imprimindo o arrayList decrescente
        System.out.println("ArrayList em ordem decrescente:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
