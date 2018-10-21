
import Process.FileHandler;
import java.io.File;

/**
 *
 * @author mint
 */
public class JBatcher_cli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new JBatcher_cli().run();
    }

    public void run() {

        FileHandler fh = new FileHandler("/home/mint/Arbejdsfolder/temp/");
        fh.makeWorkFolder("2009_interessante_billeder");
        fh.copyToWorkFolder(fh.getOriginalFolder(), fh.getWorkFolder());
    }

}
