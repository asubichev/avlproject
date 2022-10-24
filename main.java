import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.activity.InvalidActivityException;

public class main 
{
    public static void main(String[] args)
    {
        //read in every 3 lines from testbuks.txt
        //create textbook object each time
            // String key;
            // Book bookObject; Title <> Author's Name
            // int height;
            // AVLNode leftPtr;
            // AVLNode rightPtr;
        //add each textbook into da AVL tree
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
                Book temp = new Book(title, author);
                //add book object to a collection
                list[i] = temp;
                i++;
            }
        } catch (Exception e) { e.printStackTrace(); }
        
        AVLTree tree = new AVLTree<Book>(list);
        
    }
}
