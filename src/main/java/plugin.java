import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import javax.swing.*;
import java.io.IOException;

public class plugin {
    public static void main(String[] args) throws IOException {
        String nome = JOptionPane.showInputDialog(null, "Teclee usuario");
        String contrasenha = JOptionPane.showInputDialog(null,"Teclee contrasenha");
        GitHub github = new GitHubBuilder().withPassword(nome, contrasenha).build();

        GHRepository repo = github.createRepository(
                "PluginTresRamas","Tiene tres ramas",
                "https://github.com/jreyarijon",false/*private*/);
        repo.addCollaborators(github.getUser("damianCastelao"));

    }

}
