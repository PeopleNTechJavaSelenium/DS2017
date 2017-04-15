package ds;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by PIIT_NYA on 4/15/2017.
 */
public class UseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("NY");
        stack.push("FL");
        stack.push("CA");
        Iterator it = stack.iterator();
        while(it.hasNext()){
            System.out.println(stack.pop());
        }
    }
}
