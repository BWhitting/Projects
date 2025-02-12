import java.util.Scanner;

class Pet {
    String type;
    String name;
    String sound;
    int age;

    // Constructor to start pet information
    public Pet(String type, String name, String sound, int age) {
        this.type = type;
        this.name = name;
        this.sound = sound;
        this.age = age;
    }

    // Method to display pet information
    public void displayInfo() {
        System.out.println("Pet information:");
        System.out.println("Type: " + type);
        System.out.println("Name: " + name);
        System.out.println("Sound: " + sound);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined pets
        Pet cat = new Pet("Animal", "Pet Name", "Yowl", 1);
        Pet dog = new Pet("Dog", "Bella", "Woof", 11);

        // Display predefined pets
        cat.displayInfo();
        dog.displayInfo();

        // User input for new pet
        System.out.print("Enter animal type: ");
        String type = scanner.nextLine();
        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();
        System.out.print("Enter animal age: ");
        int age = scanner.nextInt();

        // Create new pet and display information
        Pet userPet = new Pet(type, name, "Meow", age);
        userPet.displayInfo();

        scanner.close();
    }
}
