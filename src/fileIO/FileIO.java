package fileIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    public static void main(String[] args) {

//        System.out.println(getFilePath("src","fileIO","test.txt").toAbsolutePath());

        System.out.println("Path exists?");
        System.out.println(doesPathExist(getFilePath("src","fileIO", "test.txt")));

    }

    public static Path getFilePath(String filename) {
        return Paths.get(filename);
    }

    public static Path getFilePath(String parentDirectory, String filename) {
        return Paths.get(parentDirectory, filename);
    }

    public static Path getFilePath(String parentDirectory, String childDirectory, String filename) {
        return Paths.get(parentDirectory, childDirectory, filename);
    }

    public static boolean doesPathExist(Path path) {
        return Files.exists(path);
    }

}
