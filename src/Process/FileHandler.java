/*
 */
package Process;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author mint
 */
public class FileHandler {

    private String fileAddress;
    private String fileName;
    private ArrayList<String> originalImageList;
    private ArrayList<String> copiedImageList;
    private File rootFolder;
    private File originalFolder;
    private File workFolder;

    public FileHandler(String root) {
        rootFolder = new File(root);
    }

    ;

    public String getFileAddress() {
        return fileAddress;
    }

    public String getFileName() {
        return fileName;
    }

    public File getRootFolder() {
        return rootFolder;
    }

    public File getOriginalFolder() {
        return originalFolder;
    }

    public File getWorkFolder() {
        return workFolder;
    }

    public ArrayList<String> getOriginalImageList() {
        return originalImageList;
    }

    public ArrayList<String> getCopiedImageList() {
        return copiedImageList;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean makeNewFolder(String newFolder) {
        File nf = new File(rootFolder.getAbsolutePath() + "/" + newFolder);
        return nf.mkdir();
    }

    public void makeWorkFolder(String newFolder) {
        originalFolder = new File(rootFolder.getAbsolutePath() + "/" + newFolder);
        this.makeNewFolder("work" + newFolder);
        workFolder = new File(rootFolder.getAbsolutePath() + "/" + "work" + newFolder);
    }

    public void copyToWorkFolder(File original, File destination) {
        Path orig;
        Path dest;
        String[] files = original.list();

        for (String file : files) {
            if (isImage(file)) {
                try {
                    orig = Paths.get(original.getAbsolutePath() + "/" + file);
                    dest = Paths.get(destination.getAbsolutePath() + "/" + file);
                    Files.copy(orig, dest);
                } catch (IOException ex) {
                    System.out.println("Error");
                }
            }
        }
    }

    public boolean isImage(String file) {
        String[] mimes = {"jpg", "raw", "png"};
        for (String mime : mimes) {
            if (file.toLowerCase().endsWith(mime)) {
                return true;
            }
        }
        return false;

    }

}
