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
        AVLNode[] list = new AVLNode[10];
        try 
        {
            Scanner scanner;
            scanner = new Scanner(new File("testbuks.txt"));
            int threepeat = 1;
            while(scanner.hasNextLine())
            {
                String isbn = scanner.nextLine();
                String title = scanner.nextLine();
                String author = scanner.nextLine();
                //TODO:create book object
                Book temp = new Book(title, author);
                //TODO:make AVLNode object
                AVLNode bemb = new AVLNode(isbn, temp, 0, null, null);
                //TODO:add AVLNode to AVLT
                
            }
        } catch (Exception e) { e.printStackTrace(); }

        // AVLTree tree = new AVLTree<>(list);
    }
}
