import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        // Decrement each number
        num1--;
        num2--;
        num3--;
        num4--;

        // Print the decremented values in the same order
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

    }
}