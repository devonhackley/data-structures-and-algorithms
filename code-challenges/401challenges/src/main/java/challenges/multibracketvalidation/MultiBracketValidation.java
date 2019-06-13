package challenges.multibracketvalidation;


import java.util.Stack;

public class MultiBracketValidation {
    public static boolean multiBracketValidation(String input){
        if(input.equals("")) return true;

        Stack stack = new Stack();
        String[] symbols = input.split("");
        boolean isBalanced = false;

        for(String c : symbols){
            if(c.equals("{") || c.equals("[") || c.equals("(")){
                //push opening brackets
                stack.push(c);
                // check to see if they are a matched pair
            } else if (c.equals("}") && stack.peek().equals("{") || c.equals("]") && stack.peek().equals("[") || c.equals(")") && stack.peek().equals("(")){
                // pop off stack
                stack.pop();
                isBalanced = true;
            } else {
                isBalanced = false;
            }
        }
        return isBalanced;
    }
}
