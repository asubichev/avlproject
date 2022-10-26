import java.io.File;
import java.util.Scanner;

import javax.activity.InvalidActivityException;

public class Main 
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
                long isbn = Long.valueOf(scanner.nextLine());
                String title = scanner.nextLine();
                String author = scanner.nextLine();
                //create book object
                Book temp = new Book(title, author, isbn);
                //add book object to a collection
                list[i] = temp;
                i++;
                // System.out.println(temp);
                //TODO: need to include leading 0s, so isbn should be String but converted for comparison only
            }
            scanner.close();
        } catch (Exception e) { e.printStackTrace(); }
        
        AVLTree tree;
        tree = new AVLTree<Book>(list);
    }
}
