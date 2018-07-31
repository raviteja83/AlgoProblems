import java.util.Stack;
import java.lang.*;

public class Solution {
    private static int countMinReversals(String expression)
    {
        int length = expression.length();
    
        if (length%2 != 0)
        return -1;
    
        Stack<Character> stack=new Stack<>();
        
        for (int i=0; i<length; i++)
        {
            char c = expression.charAt(i);
            if (c =='>' && !stack.empty())
            {
                if (stack.peek()=='<')
                    stack.pop();
                else
                    stack.push(c);
            }
            else
                stack.push(c);
        }
    
       
        int reducedLength = stack.size();
    
        int n = 0;
        while (!stack.empty() && stack.peek() == '<')
        {
            stack.pop();
            n++;
        }
    
        return (reducedLength/2 + n%2);
    }

    static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
        int n = expressions.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++ ) {
            ans[i] = countMinReversals(expressions[i]) <= maxReplacements[i] ?  1 : 0;
        }
        return ans;
    }
}