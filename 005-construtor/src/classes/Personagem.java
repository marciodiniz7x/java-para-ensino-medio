
package classes;

import javax.swing.JOptionPane;

public class Personagem {

    // atributos da classe
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;

    // método construtor
    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 5000;

        // Força
        if(classe.equals("Guerreiro")) {
            forca = nivel * 10;
        } else {
            forca = nivel;
        }
    }

    // métodos específicos
    public void mostrarStatus() {
        String status = String.format("Nome: %s \nNivel: %d \nVida %d \nClasse: %s \nForça: %d", nome, nivel, vida, classe, forca);

        JOptionPane.showMessageDialog(null, status, "Status do Personagem", JOptionPane.INFORMATION_MESSAGE);
    }

    // métodos getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
}
