import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample.txt"); // Creates file if not exists
        fw.write("Hello from Java!\nThis is a simple FileWriter example.");
        fw.close(); // Always close after writing
        System.out.println("Data written to file successfully.");
    }
}
