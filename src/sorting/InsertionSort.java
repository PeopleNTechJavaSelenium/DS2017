package sorting;

/**
 * Created by PIIT_NYA on 4/16/2017.
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {6, 5, 3, 1, 8, 7, 4};
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }
    }
}
