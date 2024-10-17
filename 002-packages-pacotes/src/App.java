// import videos.Filme;
// import videos.Novela;
// import videos.Serie;
// import videos.Documentario;
// import videos.Anime;

// ou pode importar tudo de uma vez usando .*

import videos.*;
import gui.*;
import gui.botoes.*;

public class App {
    public static void main(String[] args) throws Exception {

        // videos
        Filme filme = new Filme();
        Filme filme2 = new Filme();

        Novela novela = new Novela();

        Serie serie = new Serie();

        Documentario documentario = new Documentario();

        Anime anime = new Anime();

        // gui
        Janela janelinha = new Janela();
        MiniaturaVideo miniaturaVideo = new MiniaturaVideo();

        // gui/botoes
        BotaoPlay botaoPlay = new BotaoPlay();
        BotaoPause botaoPause = new BotaoPause();
        BotaoVoltar botaoVoltar = new BotaoVoltar();
        
    }
}
