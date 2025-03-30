import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // First ArrayList for String
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Displaying contents of the String ArrayList
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Second ArrayList for Integer
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Displaying contents of the Integer ArrayList
        System.out.println("\nNumbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Additional operations
        fruits.remove("Banana");
        numbers.add(50);

        // Displaying contents after modifications
        System.out.println("\nUpdated Fruits:");
        fruits.forEach(fruit -> System.out.println(fruit));

        System.out.println("\nUpdated Numbers:");
        numbers.forEach(number -> System.out.println(number));
    }
}
