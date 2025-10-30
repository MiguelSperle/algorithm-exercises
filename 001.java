import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//  # CHALLENGE - 001
//  The challenge is basically: [ Ask for 10 random numbers, display the list of entered numbers, and calculate the sum of only the even numbers ]

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final List<Integer> randomNumbersList = new ArrayList<>();

        int numberToBeAddedInList;

        System.out.println("You must add a number: ");

        numberToBeAddedInList = scanner.nextInt();
        randomNumbersList.add(numberToBeAddedInList);

        while (randomNumbersList.size() < 10) {
            System.out.println("You must add one more number: ");
            numberToBeAddedInList = scanner.nextInt();
            randomNumbersList.add(numberToBeAddedInList);
        }

        scanner.close();

        System.out.println("The list of entered numbers is: " + randomNumbersList);

        final int sumResult = randomNumbersList.stream().filter((n) -> n % 2 == 0).mapToInt(Integer::intValue).sum();

        System.out.println("The sum of even numbers is: " + sumResult);
    }
}
