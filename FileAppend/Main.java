import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("sample.txt",true); 
        String inp = sc.nextLine();
        fw.write(inp+"\n");
        fw.close(); 

        System.out.println("Data written to file successfully.");
    }
}