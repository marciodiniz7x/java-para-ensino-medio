import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame janela = new JFrame();

        // Elementos são classes com seu nome iniciando com J

        // Label -> texto "Usuário" na tela
        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setBounds(50, 50, 100, 30);

        // Campo de texto
        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(50, 80, 150, 30);

        // Label -> texto "Senha" na tela
        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(50, 120, 150, 30);

        // Campo de senha
        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(50, 150, 150, 30);

         // Botão
         JButton botaoLogin = new JButton("Login");
         botaoLogin.setBounds(50, 200, 150, 30);

        // Adicionar elementos à janela
        janela.add(labelUsuario); // Adicionamos o label
        janela.add(campoUsuario); // Adicionamos o campo texto
        janela.add(labelSenha); // Adicionamos o label
        janela.add(campoSenha); // Adicionamos o campo senha
        janela.add(botaoLogin); // Adicionamos o botão

        // Ação ao clicar no botão
        botaoLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());
                System.out.printf("Usuário: %s \nSenha: %s", usuario, senha);

                // Limpar os campos
                campoUsuario.setText("");
                campoSenha.setText("");
            }

        });

        // Impedimos que os elementos tenham sempre o tamanho da janela e agora teremos que definir o tamanho para cada elemento
        janela.setLayout(null);

        // Definir o tamanho da janela
        janela.setBounds(0, 0, 400, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
