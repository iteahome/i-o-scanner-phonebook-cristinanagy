import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 public class ScannerIO {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scannerObj = new Scanner(System.in);

        File phonebook = new File("C:\\Users\\Cristina\\OneDrive\\Desktop\\phonebook.txt");
        Scanner scnr = new Scanner(phonebook);

        System.out.println("Enter name: ");
        String name = scannerObj.nextLine();

        while (scnr.hasNextLine()) {
            String line = scnr.nextLine();
            if (line.contains(name))
            {
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(line);
                while (m.find()) {
                    System.out.print(m.group());
                }
            }
        }
    }
}