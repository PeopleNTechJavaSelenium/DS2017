package problem.solving;

/**
 * Created by PIIT_NYA on 4/16/2017.
 */
public class FibonacciNumbers {

    public static void main(String[] args) {
        int prev = 0;
        int next = 1;
        for(int i=0; i<45; i++){
            System.out.println(prev);
            prev = next - prev;
            next = next + prev;
        }

    }
}
