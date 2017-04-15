package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by PIIT_NYA on 4/15/2017.
 */
public class UseQueue {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.add("NY");
        queue.add("FL");
        queue.add("CA");

        Iterator it = queue.iterator();
        while(it.hasNext()){
            System.out.println(queue.remove());
        }
    }
}
