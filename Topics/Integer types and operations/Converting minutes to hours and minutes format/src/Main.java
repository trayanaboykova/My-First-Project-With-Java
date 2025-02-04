import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalMinutes = scanner.nextInt();

        // Your code comes here!
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(hours + " hours and " + minutes + " minutes");

        scanner.close();
    }
}