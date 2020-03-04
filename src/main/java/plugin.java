import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import javax.swing.*;
import java.io.IOException;

public class plugin {
    public static void main(String[] args) throws IOException {
        //Pedimos el nombre y la contraseña por teclado
        String nome = JOptionPane.showInputDialog(null, "Teclee usuario");
        String contrasenha = JOptionPane.showInputDialog(null,"Teclee contrasenha");
        //Introducimos el nombre y la contraseña para dar permiso a acceder a mi cuenta de github
        GitHub github = new GitHubBuilder().withPassword(nome, contrasenha).build();
        //Creamos el repositorio introduciendo su nombre y la descripcion
        GHRepository repo = github.createRepository(
                "PluginTresRamas","Tiene tres ramas",
                "https://github.com/jreyarijon",false/*private*/);
        //Añadimos un colaborador
        repo.addCollaborators(github.getUser("damiancastelao"));

    }

}
