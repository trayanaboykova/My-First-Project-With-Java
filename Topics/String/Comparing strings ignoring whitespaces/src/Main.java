import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String trimFirst = firstLine.replaceAll("\\s", "");
        String trimSecond = secondLine.replaceAll("\\s", "");

        System.out.println(trimFirst.equals(trimSecond));
    }
}