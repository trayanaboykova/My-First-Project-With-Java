package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String question = "What's your name?";
//        System.out.println(question);
//        String answer = sc.nextLine();
//        String greeting = "Hello, " + answer + "!";
//        System.out.println(greeting);
//        System.out.println();

//        int bubblegum = 2;
//        double toffee = 0.2;
//        int iceCream = 5;
//        int milkChocolate = 4;
//        double doughnut = 2.5;
//        double pancake = 3.2;

//        System.out.println("Prices:");
//        System.out.println("Bubblegum: $" + bubblegum);
//        System.out.println("Toffee: $" + toffee);
//        System.out.println("Ice cream: $" + iceCream);
//        System.out.println("Milk chocolate: $" + milkChocolate);
//        System.out.println("Doughnut: $" + doughnut);
//        System.out.println("Pancake: $" + pancake);

        int bubblegumTotal = 202;
        int toffeeTotal = 118;
        int iceCreamTotal = 2250;
        int milkChocolateTotal = 1680;
        int doughnutTotal = 1075;
        int pancakeTotal = 80;

        // Calculate total income
        int totalIncome = bubblegumTotal + toffeeTotal + iceCreamTotal + milkChocolateTotal + doughnutTotal + pancakeTotal;



        // Print the earned amounts
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $" + bubblegumTotal);
        System.out.println("Toffee: $" + toffeeTotal);
        System.out.println("Ice cream: $" + iceCreamTotal);
        System.out.println("Milk chocolate: $" + milkChocolateTotal);
        System.out.println("Doughnut: $" + doughnutTotal);
        System.out.println("Pancake: $" + pancakeTotal);
        System.out.println();

        // Print the total income
        System.out.println("Income: $" + totalIncome);
        System.out.println("Staff expenses:");
        int staffExpenses = sc.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = sc.nextInt();
        int netIncome = totalIncome - (staffExpenses + otherExpenses);
        System.out.println("Net income: $" + netIncome);

    }
}