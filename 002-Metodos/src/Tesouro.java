import java.util.Random;

public class Tesouro {

    public static String bau() {
        
        Random tesouro = new Random();
        int probab = tesouro.nextInt(3);

        switch (probab) {
            case 0:
                return "espada Excalibur +5";
            
            case 1:
                return "5000 de Ouro";
                
            case 2:
                return "armadura Genji";
        
            default:
                return "Baú vazio";
        } 
               
    }

}
