package array;

public class Array_FindMinimum {
    public static void main(String[] args) {

        int[] arr = {-100, 5, 6, 9, 7, 2, -5, 2, 2, - 99, 22, 0};
        System.out.println(returnMin(arr));
    }

    public static int returnMin(int[] arr) {
        int min = arr[0];//default array value index 0; variable min  can contain only 1 number;
        for (int i = 1; i < arr.length; i++) { //iteration from 0 to the last index
            if (arr[i] < min) { // iteration will be implemented from the first to the last element and will be finished
                min = arr[i]; // it will place min value element into variable min
            }
        }
        return min; //return min value;
    }
}
// Write a function that can find the minimum number from an int Array