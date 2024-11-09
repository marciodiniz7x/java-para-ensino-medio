public class App {
    public static void main(String[] args) throws Exception {
        Telefone telefone = new Telefone("4002 8922");
        System.out.println(telefone.getContatos());;

        Contato contato = new Contato("Márcio", "90901234");
        System.out.println(contato.toString());
    }
}
