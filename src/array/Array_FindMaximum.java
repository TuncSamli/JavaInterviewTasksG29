package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_FindMaximum {
    public static void main(String[] args) {

        int[] arr = {23,5,6,9,7,26,-5,2,21,-99,22,0};// 12 - elements; 11 - indexes;
        System.out.println(returnMax(arr)); //printing method returnMax + value
        Arrays.sort(arr); // method #2
        System.out.println("Minimum = " + arr[0]); //method #2 printing index 0, which is automatically the smallest after sorting
        System.out.println("Maximum = " + arr[arr.length-1]);// method #2 printing  last index, which is automatically the biggest after sorting accordingly
    }
     public static int returnMax(int [] arr){
        int max = arr[0];//very first index which was collected as max after iterating.
         for (int i = 0; i < arr.length; i++) { //iteration from 0 to the last index
             if (arr[i]>max){ // iteration will be implemented from the first to the last element and will be finished
                 max=arr[i]; // it will place max value element into variable max
             }
         }
return max; //return max value;
    }
}
//Write a function that can find the maximum number from an int Array