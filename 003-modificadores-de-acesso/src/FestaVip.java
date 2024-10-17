public class FestaVip {

    // <modificador> <tipo> <nome-atributo>
    private int quantidadeCafe = 30;
    private int quantidadeSalgador = 50;

    public void entrar() {
        System.out.println("\nEntrou na festa \n");
        beberCafe();
        comerSalgado();
        beberCafe();
        System.out.println("\nSaiu da festa \n");
    }
    
    // <modificador> <retorno-metodo> <nome-metodo>
    private void beberCafe() {
        quantidadeCafe--;
        System.out.println("Bebeu 1 xícara de café");
    }

    // <modificador> <retorno-metodo> <nome-metodo>
    private void comerSalgado() {
        quantidadeSalgador--;
        System.out.println("Comeu 5 salgados");
    }
}
