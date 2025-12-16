import searching.MinimumInRotatedArray;

public class App {
    public static void main(String[] args) {
        // System.out.println("Factorial of 10 = " + Factorial.factorial(10)); // output for factorial
        // System.out.println("10th term in fibonacciSeries = " + FibonacciSeries.fibonacciSeries(10)); // output for fibonacciSeries

        int[] arr = new int[]{3, 1, 2};
        // int[] arr = new int[]{};
        // MergeSort.mergeSort(arr, 0, arr.length-1);
        // BubbleSort.bubbleSort(arr);
        // InsertionSort.insertionSort(arr);
        // QuickSort.quickSort(arr, 0, arr.length-1);
        // ReverseArray.reverseArray(arr, 0, arr.length-1);
        // System.out.println(Arrays.toString(arr)); // Output for sorting algorithms

        System.out.println(MinimumInRotatedArray.findMin(arr));
    }
}