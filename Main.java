import java.io.File;
import java.util.Scanner;

import javax.activity.InvalidActivityException;

public class Main 
{
    public static void main(String[] args)
    {
        //read in every 3 lines from input file
        //create textbook object each time
            // String isbn //compared as long
            // String title
            // String Author
        Book[] list = new Book[10];
        int i = 0;
        try 
        {
            Scanner scanner;
            scanner = new Scanner(new File("testbuks.txt"));
            while(scanner.hasNextLine())
            {
                String isbn = scanner.nextLine();
                String title = scanner.nextLine();
                String author = scanner.nextLine();
                //create book object
                Book temp = new Book(title, author, isbn);
                //add book object to a collection
                list[i] = temp;
                i++;
            }
            scanner.close();
        } catch (Exception e) { e.printStackTrace(); }
        
        AVLTree tree;
        tree = new AVLTree<Book>(list);
    }
}
