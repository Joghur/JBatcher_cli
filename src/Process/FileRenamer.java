package Process;


import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Metadata;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mint
 */
public class FileRenamer {

    private ArrayList<String> changeImages;
    private String regexPattern;
    private int concurrentIndex;
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;

    public void renameExif() {

    }

    public void renameRegex(File imagePath) {
        try {
            Metadata metadata = ImageMetadataReader.readMetadata(imagePath);
        } catch (ImageProcessingException ex) {
            System.out.println("Exif error. ImageProcessingException");
        } catch (IOException ex) {
            System.out.println("Exif error. IOException");
        }
    }

    public void renameConcurrent() {

    }

    public void renameFromFilestamp() {

    }

    public void renameRealtiveTime() {

    }

}
