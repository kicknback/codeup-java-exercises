package fileIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

    public static void main(String[] args) {

        init();

    }

    public static void init() {
        //System.out.println(getFilePath("src","fileIO","test.txt").toAbsolutePath());

        //System.out.println("Path exists?");
        //System.out.println(doesPathExist(getFilePath("src","fileIO", "test.txt")));
        //tryCreateDirectory(getFilePath("src","fileIO","test.txt"));

        Path path = FileDirectoryUtil.getPath("src", "fileIO", "files.txt");
        FileDirectoryUtil.tryCreateDirectory(path);

        path = Paths.get(path.toString(), "test.txt");

        FileDirectoryUtil.tryCreateFile(path);

        System.out.println(path);

        List<String> contentToWrite = new ArrayList<>();
        contentToWrite.add("This is a new line!");
        contentToWrite.add("ANOTHER LINE\nblah blah blah");

        // Print what's in file BEFORE
        IOUtil.tryPrintContents(path);

        // Try to write to the file
        IOUtil.tryWriteToFile(getContent(), path);

        // And print after write operation
        IOUtil.tryPrintContents(path);



    }

    public static List<String> getContent() {
        List<String> contentToWrite = new ArrayList<>();
        contentToWrite.add("This is a new line!");
        contentToWrite.add("ANOTHER LINE\nblah blah blah");

        return contentToWrite;
    }


}
