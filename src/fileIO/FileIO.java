package fileIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

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

        IOUtil.tryPrintContents(path);

    }


}
