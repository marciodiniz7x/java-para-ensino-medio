import javax.swing.JOptionPane;

import classes.Personagem;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        String nome = JOptionPane.showInputDialog(null, "Nome do Personagem");
        String classe = JOptionPane.showInputDialog(null, "Classe do Personagem");

        Personagem guerreiro = new Personagem(nome, classe);

        guerreiro.mostrarStatus();
     
    }
}
