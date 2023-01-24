import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hotdog");

        food.set(0, "Sushi");

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
