package Algorithms.Sorting.SelectionSort;

import Algorithms.Sorting.BubbleSort.BubbleSort;
import Algorithms.Sorting.Utility;

public class Tester {

    public static void main(String[] args) {
        int[] arr = Utility.createArray(10, 10);
        Utility.printArray(arr);
        SelectionSort.sort(arr);
        Utility.printArray(arr);
    }

}
