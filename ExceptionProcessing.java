import java.io.*;
import java.util.Scanner;

public class ExceptionProcessing 
	{
    public static void main(String[] args) 
    	{
        Scanner scanner = new Scanner(System.in);
        String filePath;

        do 
        {
            System.out.print("Please enter the path to open the input file (e.g., C:\\Downloads\\lines.txt): ");
            filePath = scanner.nextLine();

            try 
            {
                readAndWriteFile(filePath);
                System.out.println("File processed successfully.");
                break;
            } catch (FileNotFoundException e) {
                System.out.println("File is not found, please try again.");
            }

        } while (true);

        scanner.close();
    }

    private static void readAndWriteFile(String filePath) throws FileNotFoundException {
        File inputFile = new File(filePath);
        Scanner fileScanner = new Scanner(inputFile);

        while (fileScanner.hasNextLine()) 
        {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        fileScanner.close();
    }
}
