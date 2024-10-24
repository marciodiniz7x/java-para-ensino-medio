package classes;

public class TiroAoAlvoOnline implements Jogo {

    @Override
    public void fechar() {
        
        System.out.println("Salvando o progresso no servidor");
        System.out.println("Sair da partida");
        System.out.println("Sair do jogo");

    }

    @Override
    public void jogar() {
        
        System.out.println("Carregando o jogo");
        System.out.println("Se conectando ao servidor");
        System.out.println("Carregando partida");
    }
    
}
