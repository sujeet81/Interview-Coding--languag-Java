package CodingProblem.BasicProgramming;

import com.sun.jdi.request.BreakpointRequest;

import java.util.Scanner;
import java.util.Stack;

public class ValidateBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//        boolean r = isValidateBracket(s);
//        System.out.println(s);
//        System.out.println(r);
//        String s = "()[]{}";
        boolean r = validateBracket(s);
        System.out.println(s);
        System.out.println(r);

    }
    private static boolean validateBracket(String s ){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '}'){
                if(stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }

            }
            else if(ch == ')'){
                if (stack.peek() == '('){
                    stack.pop();
                }
                else {
                    return false;
                }

            }
            else if (ch == ']') {
                if(stack.peek() == '['){
                    stack.pop();
                }else {
                    return false;
                }

            }
            else {
                stack.push(ch);

            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;

    }


//    private static boolean isValidateBracket(String s){
//
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0; i<s.length();i++){
//            char ch = s.charAt(i);
//            if(ch == ')'){
//                if(stack.peek() == '(') {
//                    stack.pop();
//                }
//                else {
//                    return false;
//                }
//            }
//            else if (ch == ']') {
//                if(stack.peek() == '['){
//                    stack.pop();
//                }
//                else {
//                    return false;
//                }
//            } else if (ch == '}') {
//                if(stack.peek() == '{'){
//                    stack.pop();
//                }
//                else {
//                    return false;
//                }
//            }
//            else{
//                stack.push(ch);
//            }
//        }
//        if(stack.isEmpty()){
//            return true;
//        }
//        return false;
//    }

}
