package parkinglot;

public class SearchNumber {


    public static boolean searchNumber(int[] n, int k) {
         for(int i=0; i<n.length; i++) {
             if(n[i] == k) {
                 return true;
             }
         }
        return false;
    }

    // STS



    public static void main(String[] args) {

    }
}
