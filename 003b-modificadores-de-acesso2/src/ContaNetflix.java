public class ContaNetflix {
    private String idiomaPreferincial;
    private String resolucaoTela;

    public void entrar() {

        // pegar infos do idioma do usuário
        buscarPreferenciasDoUsuario();

        // pegar resolução da tela
        identificarResolucao();

    }

    private void buscarPreferenciasDoUsuario() {
        idiomaPreferincial = "PT-BR";
    }

    private void identificarResolucao() {
        resolucaoTela = "Full HD";
    }

    public void assistirFilme(String nomeFilme) {
        System.out.println("Iniciando o filme " + nomeFilme);
        System.out.println("Carregando o filme na resolução " + resolucaoTela);
        carregarAudioFilme();
    }

    private void carregarAudioFilme() {
        if(idiomaPreferincial == "PT-BR" || idiomaPreferincial == "EU-US") {
            System.out.println("Carregando o áudio em " + idiomaPreferincial);
        } else {
            System.out.println("Carregando o áudio padrão em EN-US");
        }
    }
}
