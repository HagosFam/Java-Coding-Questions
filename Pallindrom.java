public class Pallindrom {
    // check if a given string is pallindrom

    public static boolean isPalindrom(String input) {
        int length = input.length();
        int halfLength = length/2;
       for(int i=0; i<halfLength; i++) {
           if(input.charAt(i) != input.charAt(length-1-i)) {
               return false;
           }
       }
     return true;
    }
    public static void main(String[] args) {
        String test = "maddam";
        System.out.println(isPalindrom(test));

    }
}
