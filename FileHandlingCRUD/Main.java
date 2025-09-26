import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "Sample.txt"; 

        while (true) {
            System.out.println("\n=== FILE CRUD OPERATIONS ===");
            System.out.println("1. Create File");
            System.out.println("2. Write to File (Overwrite)");
            System.out.println("3. Append to File");
            System.out.println("4. Read File");
            System.out.println("5. Delete File");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1->{
                    // === Create File ===
                    try {
                        File file = new File(fileName);
                        if (file.createNewFile()) {
                            System.out.println("File created: " + file.getName());
                        } else {
                            System.out.println("File already exists.");
                        }
                    } catch (IOException e) {
                        System.out.println("Error creating file: " + e.getMessage());
                    }
                }

                case 2->{
                    // === Write to File (Overwrite) ===
                    try {
                        FileWriter writer = new FileWriter(fileName);
                        System.out.print("Enter content to write: ");
                        String content = sc.nextLine();
                        writer.write(content);
                        writer.close();
                        System.out.println("Content written to file (old content replaced).");
                    } catch (IOException e) {
                        System.out.println("Error writing to file: " + e.getMessage());
                    }
                }
                case 3->{
                    // === Append to File ===
                    try {
                        FileWriter writer = new FileWriter(fileName, true); // true = append mode
                        System.out.print("Enter content to append: ");
                        String content = sc.nextLine();
                        writer.write("\n" + content);
                        writer.close();
                        System.out.println("Content appended to file.");
                    } catch (IOException e) {
                        System.out.println("Error appending to file: " + e.getMessage());
                    }
                }
                case 4->{
                    
                    // === Read File ===
                    try {
                        File file = new File(fileName);
                        if (!file.exists()) {
                            System.out.println("File does not exist.");
                            break;
                        }
                        FileReader fr = new FileReader(file);
                        BufferedReader reader = new BufferedReader(fr);

                        System.out.println("File content:");
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        reader.close();
                    } catch (IOException e) {
                        System.out.println("Error reading file: " + e.getMessage());
                    }
                }

                case 5->{
                    // === Delete File ===
                    File file = new File(fileName);
                    if (file.delete()) {
                        System.out.println("File deleted successfully.");
                    } else {
                        System.out.println("Failed to delete file or file doesn't exist.");
                    }
                }

                case 6 ->{
                    // === Exit Program ===
                    System.out.println("Exiting program. Goodbye!");
                    sc.close();
                    System.exit(0);
                }
                default->{
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}