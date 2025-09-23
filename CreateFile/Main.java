import java.io.File;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        File f = new File("sample.txt");
        if(f.createNewFile()){
            System.out.println("File Cretaed Sucessfully");
        }
        else{
            System.out.println("File Already Exists");
        }
    }
}