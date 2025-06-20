package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileBinaryApp {

    public static void main(String[] args) {

    }

    public static void binaryInputReadWrite(String inputFile, String outputFile) throws IOException {

        final int BUFFER_SIZE = 4096;       // 2KB buffer
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;

        try (FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile)) {

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);

            }

            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;

        }
    }
}
