package array;

public class Array_FindMaximum {
    public static void main(String[] args) {

        int[] arr = {23,5,6,9,7,26,-5,2,21,-99,22,0};// 12 - elements; 11 - indexes;
        System.out.println(returnMax(arr)); //printing method returnMax + value
    }
     public static int returnMax(int [] arr){
        int max = arr[0];//default array value index 0; variable max  can contain only 1 number;
         for (int i = 0; i < arr.length; i++) { //iteration from 0 to the last index
             if (arr[i]>max){ // iteration will be implemented from the first to the last element and will be finished
                 max=arr[i]; // it will place max value element into variable max
             }
         }
return max; //return max value;
    }
}
//Write a function that can find the maximum number from an int Array