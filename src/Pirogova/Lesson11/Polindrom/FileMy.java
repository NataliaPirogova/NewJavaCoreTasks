package Pirogova.Lesson11.Polindrom;

import java.io.*;
import java.net.URI;

public class FileMy extends File {
    private String fileName;

    public void textWrite() throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        System.out.println("Вводите слова. Для выхода нажмите '/'");
        InputStreamReader isr = new InputStreamReader(System.in);
        char letter = (char) isr.read();
        do {
            bw.append(letter);
            bw.newLine();
        }
        while (letter!='/');
    }

    public FileMy(String pathname) {
        super(pathname);
    }

    public FileMy(String parent, String child) {
        super(parent, child);
    }

    public FileMy(File parent, String child) {
        super(parent, child);
    }

    public FileMy(URI uri) {
        super(uri);
    }
}
