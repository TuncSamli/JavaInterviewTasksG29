package array;

public class Array_FindMaximum {
    public static void main(String[] args) {

        int[] arr = {0,5,6,9,7,2,-5,2,2-99,22,0};


        System.out.println(returnMax(arr));
    }
     public static int returnMax(int [] arr){
        int max = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if (arr[i]>max){
                 max=arr[i];
             }
         }
return max;
    }
}
//Write a function that can find the maximum number from an int Array