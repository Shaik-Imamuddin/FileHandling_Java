import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("sample.txt");
        FileReader fr = new FileReader(f);
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }
        fr.close();
    }
}