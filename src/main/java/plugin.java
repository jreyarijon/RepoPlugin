import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import javax.swing.*;
import java.io.IOException;

public class plugin {
    public static void main(String[] args) throws IOException {
        //Pides por teclado el nombre y la descripcion del repositorio que vas a crear
        String nome = JOptionPane.showInputDialog("Nombre del repositorio");
        String descripcion = JOptionPane.showInputDialog("Descripcion");
        //Creamos el archivo .github en la carpeta del proyecto, escribimos ahi nuestro token y pegamos su direccion en el GitHubBuilder
        GitHub github = GitHubBuilder.fromPropertyFile("C:\\Users\\Josemolamazo\\IdeaProjects\\pluginGitCd\\.github").build();
        //Creamos el repositorio con los datos que que habiamos pedido por teclado
        GHRepository repo = github.createRepository(nome,descripcion,
                "https://github.com/jreyarijon",false);
        //Añadimos un colaborador al repositorio
        //repo.addCollaborators(github.getUser("damiancastelao"));
    }

}
