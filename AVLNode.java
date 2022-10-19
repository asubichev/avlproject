public class AVLNode
{
    String key;
    Book bookObject; // Title <space> Author’s last name, any other attribute 
    int height;
    AVLNode leftPtr;
    AVLNode rightPtr;

    public AVLNode()
    {
        key = ""; bookObject = null; height = 0; leftPtr = null; rightPtr = null;
    }

    public AVLNode(String str, Book book, int deep, AVLNode l, AVLNode r)
    {
        key = str; bookObject = book; height = deep; leftPtr = l; rightPtr = r;
    }
}
