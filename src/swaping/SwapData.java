package swaping;

/**
 * Created by PIIT_NYA on 4/16/2017.
 */
public class SwapData {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);
    }
}
