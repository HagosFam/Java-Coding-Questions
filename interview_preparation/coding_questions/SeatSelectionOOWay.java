package interview_preparation.coding_questions;

public class SeatSelectionOOWay {
    // by seat selection, i mean seat placing.

    // oo way

    // passenger

    // there is airplane

    // a seat can be booked or free - have a method that returns if a seat is free or booked

    public static void main(String[] args) {
        Seat seat = new Seat();

    }
}

class Seat {
    private boolean seatStatus;

    public void booked() {
        seatStatus = true;
    }

    public boolean getSeatstaus() {
        return seatStatus;
    }

    public void unbook() {
        seatStatus = false;
    }

}
