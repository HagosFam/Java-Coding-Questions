package interview_preparation.coding_questions;

import java.util.Arrays;
import java.util.List;

public class ArraysQuestions {



    // check the directions

    public static boolean isBackToHome(List<Character> directions) {

        int s =0; int n=0;  int w=0; int e =0;
        for (Character direction : directions) {
            switch (direction) {
                case 'w': w++; break;
                case 's': s++; break;
                case 'n': n++; break;
                case 'e': e++; break;
            }
        }
      if(s==n && w==e) {
          return true;
      }
return false;
    }

    public static int[] returnArray(int[] array) {
        int sum=0;
        int[] newArray = new int[array.length];
        int index =0;
       for(int i=0; i < array.length -1; i ++) {
           for(int j=i+1; j<array.length; j++ ) {
                sum +=array[j];
           }
           if(array[i] > sum) {
               newArray[index++] = array[i];
           }
           sum = 0;
       }
       return Arrays.copyOf(newArray, index);
    }
    public static void main(String[] args) {

//        int[] test = {20, 4, 1, 3, 2, 5};
//        System.out.println(Arrays.toString(returnArray(test)));

        List<Character> path = List.of('n',  'e', 'w', 's');
        List<Integer> integerList = Arrays.asList(2,4,5,6,8,9,9); // ways to creat list
        boolean result = isBackToHome(path);

        System.out.println(result? "You are back home" : "You are not home yet");


    }
}
