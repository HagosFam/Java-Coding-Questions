package interview_preparation.polymorphism;

public class Polymorphism {
    // Overloading can happen

    // over laoding
      // different variable count
      // different data types

    int add(int a, int b) {
        return a+b;
    }

    // different data type and same count with the above
    double add(double a, double b) {
        return a+b;
    }

    int add(int a, int b, int f, int l) {
        return a+b;
    }

    int add(int a, int b, int k) {
        return a+b;
    }

    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();

        poly.add(2 ,4); // this is one demonstration of data types.
        // it can also happen in sub class /  super class hierarichy.

        poly.add(3,4,5); //

    }

}
