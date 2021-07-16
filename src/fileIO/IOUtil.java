package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class IOUtil {

    public static List<String> readFromFile(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    public static void printFileContents(List<String> contents) {
        for (String line : contents) {
            System.out.println(line);
        }
    }

    public static void tryPrintContents(Path path) {
        try {
            printFileContents(readFromFile(path));
        } catch (IOException e) {
            System.out.printf("Unable to read contents of the file at: %s", path.toAbsolutePath());
        }
    }

    public static void tryWriteToFile(List<String> content, Path path) {
        try {
            Files.write(path, content, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.printf("Could not write to file at: %s\n", path.toAbsolutePath());
        }
    }

}
