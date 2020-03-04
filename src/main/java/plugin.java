import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import javax.swing.*;
import java.io.IOException;

public class plugin {
    public static void main(String[] args) throws IOException {
        //Introducimos por taclado nuestro token
        String token = JOptionPane.showInputDialog(null, "Teclee token");
        //Doy permiso para que acceda a mi github utilizando el token
        GitHub github = new GitHubBuilder().withOAuthToken(token).build();
        //Creamos el repositorio
        GHRepository repo = github.createRepository(
                "PluginTresRamasToken","Tiene tres ramas",
                "https://github.com/jreyarijon",false/*private*/);
        //Añadimos un colaborador
        //repo.addCollaborators(github.getUser("damiancastelao"));

    }

}
