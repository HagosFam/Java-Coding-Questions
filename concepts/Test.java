package concepts;

// It is a way to create a generic entity, it can be a method or class. it works with different data types.
// it is blue print or general definition.
public class Test <T> { // this parametrized class. just a normal class with parameter
    // we can have many parameters as we went as you like
    T element;

    Test(T ele) {
        this.element = ele;
    }

    public T getElement() {
        return this.element;
    }

    public static  <T> void display(T element) {
        System.out.println(element);
    }

    public static void main(String[] args) {
        Test<Integer> tInt = new Test<>(15);
        System.out.println(tInt.getElement()); // prints 15

        Test<String> tStr = new Test<>("JPMC");
        System.out.println(tStr.getElement());


        display(11);
        display(0.4);
        display("JPMorgan");


    }

}
