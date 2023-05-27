public class Stack 
{
    private Node top;
    public Stack()
    {
        top = null;
    }
    public void push(char nodeValue)
    {
        Node node = new Node(nodeValue);
        if (top == null)
        {
            top = node; 
        }
        else
        { 
            node.setNext(top);
            top = node;
        }
    }
    public char pop()
    {
        if (top == null)
        {
            System.out.println("There is no node in the stack");
            return '\0';
        }
        else
        {
            char value = top.getValue();
            if (top.getNext() != null)           
                top = top.getNext();           
            else 
                top = null;
            return value;
        }
    }
    public char peek()
    {
        if (top == null)
        {
            System.out.println("There is no node in the stack");
            return '\0';
        }
        else
        {
            char value = top.getValue();
            return value;
        }
    }
}
