// Towers.java
public class Towers {
    public static void solveTowers(int n, char source, char target, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }
        solveTowers(n - 1, source, auxiliary, target);
        System.out.println("Move disk " + n + " from " + source + " to " + target);
        solveTowers(n - 1, auxiliary, target, source);
    }
}

// Runner.java
public class Runner {
    public static void main(String[] args) {
        int n = 3; // Number of disks
        Towers.solveTowers(n, 'A', 'C', 'B'); // A, B and C are names of rods
    }
}
