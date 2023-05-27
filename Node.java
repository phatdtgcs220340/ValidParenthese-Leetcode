public class Node
{
    private char value; 
    private Node next; 
    public Node(char value)
    {
        this.value = value; 
        this.next = null; 
    }
    public void setValue(char value)
    {
        this.value = value;
    }
    public char getValue() 
    {
        return value;
    }
    public void setNext(Node next)
    {
        this.next = next; 
    }
    public Node getNext()
    {
        return next;
    }
}