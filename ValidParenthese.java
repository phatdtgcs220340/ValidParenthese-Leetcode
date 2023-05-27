import java.util.Scanner;
public class ValidParenthese
{
    public static boolean checkValidParenthese(String string)
    {
        Stack stack = new Stack();
        for (int i = 0 ; i < string.length() ; i++) // iterate through the string
        {
            char current_character = string.charAt(i);
            // push the open parenthese
            if (current_character == '(' || current_character == '[' || current_character == '{')    
                stack.push(current_character);
            // pop if the stack top is correspond to the close parenthese
            else 
            {
                if (current_character == ')' && stack.peek() == '(')
                    stack.pop();
                if (current_character == ']' && stack.peek() == '[')
                    stack.pop();
                if (current_character == '}' && stack.peek() == '{')
                    stack.pop();
            }
        }
        if (stack.peek() == '\0')
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        String string = input.nextLine();
        System.out.print(checkValidParenthese(string));
    }
}