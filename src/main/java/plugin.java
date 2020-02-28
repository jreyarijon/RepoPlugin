import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import javax.swing.*;
import java.io.IOException;

public class plugin {
    public static void main(String[] args) throws IOException {
        String token = JOptionPane.showInputDialog(null, "Teclee token");

        GitHub github = new GitHubBuilder().withOAuthToken(token).build();

        GHRepository repo = github.createRepository(
                "PluginTresRamasToken","Tiene tres ramas",
                "https://github.com/jreyarijon",false/*private*/);
        repo.addCollaborators(github.getUser("damianCastelao"));

    }

}
