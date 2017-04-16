package sorting;

/**
 * Created by PIIT_NYA on 4/16/2017.
 */
public class Sorting {

    public int [] insertionSort(int [] array){
        int [] sortedArray = new int [array.length];
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
        return sortedArray;
    }

    public int [] selectionSort(int [] array){
        int [] sortedArray = new int [array.length];
        //implement selection sort
        return sortedArray;
    }

    public int [] mergeSort(int [] array){
        int [] sortedArray = new int [array.length];
        //implement merge sort
        return sortedArray;
    }
    public int [] bubbleSort(int [] array){
        int [] sortedArray = new int [array.length];
        //implement merge sort
        return sortedArray;
    }

    public int [] quickSort(int [] array){
        int [] sortedArray = new int [array.length];
        //implement merge sort
        return sortedArray;
    }
}
