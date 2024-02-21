package topshiriq4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class copyFile {
    public static void main(String[] args) {
        File sourceFile = new File("D:\\javafolder\\ExamFromMe\\forCopy.txt");

        // Destination file with the same name
        File destFile = new File("test_copy.txt");

        try {
            Files.copy(sourceFile.toPath(), destFile.toPath());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
