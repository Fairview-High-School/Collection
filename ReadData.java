import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ReadData
{

    public static void main( String args[] ) throws IOException
    {
        //Code for reading into the Collection from a File.
        File file = new File("data.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            double data = Double.parseDouble(scanner.nextLine());
            System.out.println(data);//delete this line
            //code to add data (from data.txt) to the Collection

        }
        scanner.close();

        //The rest of the code, to do stuff with the data in the Collection
    }
}