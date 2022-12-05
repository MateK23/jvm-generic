
public class Main {
    public static void main(String[] args) {

        Box<Integer, String> box = new Box<>();
        box.put(10, "Zura");

        System.out.println(box.getKey());
    }
}
