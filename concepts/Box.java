package concepts;

public class Box <T>{
    T name;

    Box(T n) {
        this.name = n;
    }


    public static void main(String[] args) {
        Box<String> box = new Box<>("Name");
    }
}
