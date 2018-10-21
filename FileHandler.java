/*
 */
package jbatcher_cli;

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

    public FileHandler() {
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public String getFileName() {
        return fileName;
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

    public void makeNewFolder(String rootFolder) {

    }

    public void copyToWorkFolder(String workFolder) {

    }

    public void logger(String text) {

    }

    public void fillImageList(String fileAdress, ArrayList<String> inages) {

    }
}
