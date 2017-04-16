package problem.solving;

/**
 * Created by PIIT_NYA on 4/16/2017.
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int counter = 0;
        for(int i=2; i<10000000; i++){
            if(isPrime(i)){
                counter++;
               System.out.println(i);
            }
        }
        System.out.println("Total Prime Number up to this point:  " + counter);
    }

    public static boolean isPrime(int number){
        if(number % 2 == 0){
            return false;
        }
        for(int i=3; i*i<=number; i=i+2){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
