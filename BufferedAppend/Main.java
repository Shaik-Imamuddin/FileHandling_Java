import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("sample.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        String inp =sc.nextLine();
        bw.write(inp);
        bw.newLine(); 
        bw.close();

        System.out.println("Data written successfully..");
    }
}