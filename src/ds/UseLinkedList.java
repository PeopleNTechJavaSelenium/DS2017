package ds;

/**
 * Created by PIIT_NYA on 4/15/2017.
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many state name do you want to insert: ");
        int numberOfInput = input.nextInt();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<numberOfInput; i++) {
            System.out.println("please enter state name: ");
            String stateName = sc.nextLine();
            list.add(stateName);
        }
        //Using Iterator
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Using for each loop
        for(String state:list){
            System.out.println(state);
        }
    }
}
