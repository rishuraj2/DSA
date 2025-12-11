
import searching.LowerBound;


public class App {
    public static void main(String[] args) {
        // System.out.println("Factorial of 10 = " + Factorial.factorial(10)); // output for factorial
        // System.out.println("10th term in fibonacciSeries = " + FibonacciSeries.fibonacciSeries(10)); // output for fibonacciSeries

        // int[] arr = new int[]{1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 5, 5, 5, 6, 7, 8, 8, 8, 9, 9};
        int[] arr = new int[]{};
        // MergeSort.mergeSort(arr, 0, arr.length-1);
        // BubbleSort.bubbleSort(arr);
        // InsertionSort.insertionSort(arr);
        // QuickSort.quickSort(arr, 0, arr.length-1);
        // ReverseArray.reverseArray(arr, 0, arr.length-1);
        // System.out.println(Arrays.toString(arr)); // Output for sorting algorithms

        System.out.println(LowerBound.lowerBound(arr, 0, arr.length-1, 20));
    }
}