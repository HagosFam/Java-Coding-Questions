package interview_preparation.coding_questions;

public class SeatSelectionNonOOWay {
   public static boolean[][] seat = new boolean[20][6];

 public static int getSeatLength() {
  return seat.length;
 }

 public static boolean reserveSeat(int row, int col) {
     if(!seat[row][col]) {
         // seat.length = rows
         // seat[row].length = cols

      if(row>=1 && row<= seat.length && col>=1 && col <= seat[row].length) {
       System.out.println(seat[row].length);
       seat[row][col] = true;
       return true;
      }
     }
     return false;
    }

    public static void main(String[] args) {
     System.out.println(reserveSeat(19,5));
     System.out.println(reserveSeat(3,1));
     System.out.println(reserveSeat(3,1));

     System.out.println(getSeatLength());
    }
}
