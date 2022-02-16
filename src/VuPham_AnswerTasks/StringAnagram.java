package VuPham_AnswerTasks;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {

        System.out.println("anagram(\"abc\", \"cab\") = " + anagram("abc", "cab"));


    }

    public static boolean anagram(String str1, String str2){

        boolean result = false;

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)) {
            result = true;
        }

        return result;


    }


}
/*
Write a  function that check if a string is build out of the same letters as another string.
        Ex: same("abc", "cab"); -> true , Solution 1:
            same("abc", "abb"); -> false:
 */