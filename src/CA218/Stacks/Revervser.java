package CA218.Stacks;

import java.util.Stack;

public class Revervser {

    public static void main(String[] args) {
        String input = "SOMALIA MOGADISHU";
        String result = reverse(input);
        System.out.println("String reversed: " + result);

    }

    public static String reverseBuffer(String input){
        Stack<Character> s1 = new Stack<>();
        for(char letter: input.toCharArray() ){
            s1.push(letter);
        }
        StringBuffer reversed = new StringBuffer();
        while(!s1.isEmpty()){
            reversed.append(s1.pop());
        }
        return reversed.toString();
    }
    public static String reverse(String input){
    Stack<Character> stack = new Stack<>();
    //1 . push elements
        for(int i =0; i<input.length(); i++){
            stack.push(input.charAt(i));
        }
        String reversed = "";
        while( !stack.isEmpty()){
            Character out = stack.pop();
            if(!stack.contains(out))
                reversed += out;
        }
        return reversed;
    }
}
