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

    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<String> getOriginalImageList() {
        return originalImageList;
    }

    public void setOriginalImageList(ArrayList<String> originalImageList) {
        this.originalImageList = originalImageList;
    }

    public ArrayList<String> getCopiedImageList() {
        return copiedImageList;
    }

    public void setCopiedImageList(ArrayList<String> copiedImageList) {
        this.copiedImageList = copiedImageList;
    }
    
    
}
