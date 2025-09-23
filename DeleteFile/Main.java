import java.io.File;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        File f = new File("sample.txt");
        if(f.delete()){
            System.out.println("Sucessfully Deleted the file");
        }
        else{
            System.out.println("No Such File Exists");
        }
    }
}