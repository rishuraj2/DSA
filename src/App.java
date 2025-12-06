import java.util.Arrays;
import sorting.InsertionSort;

public class App {
    public static void main(String[] args) {
        // System.out.println("Factorial of 10 = " + Factorial.factorial(10)); // output for factorial
        // System.out.println("10th term in fibonacciSeries = " + FibonacciSeries.fibonacciSeries(10)); // output for fibonacciSeries

        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        // MergeSort.mergeSort(arr, 0, arr.length-1);
        // BubbleSort.bubbleSort(arr);
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}