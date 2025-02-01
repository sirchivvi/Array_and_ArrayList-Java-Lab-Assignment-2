// Name: Akhil Chivukula
// PRN: 23070126009
// Batch: AIML - A1

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInput userInput = new UserInput();
        EvenOddSeparator separator = new EvenOddSeparator();
        SmallestNeighborDistance neighborDistance = new SmallestNeighborDistance();
        ArrayConversion converter = new ArrayConversion();

        int choice;
        do {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Separate Even and Odd Numbers");
            System.out.println("2. Find Smallest Neighbor Distance");
            System.out.println("3. Convert Array to ArrayList and Vice Versa");
            System.out.println("4. Exit");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    int[] numbers = userInput.getArrayInput();
                    separator.separateEvenOdd(numbers);
                    break;
                case 2:
                    int[] arr = userInput.getArrayInput();
                    int index = neighborDistance.findSmallestDistance(arr);
                    System.out.println("Index of first number in smallest distance pair: " + index);
                    break;
                case 3:
                    Integer[] numArray = {1, 2, 3, 4, 5};
                    ArrayList<Integer> arrayList = converter.arrayToArrayList(numArray);
                    System.out.println("Converted ArrayList: " + arrayList);
                    Integer[] newArray = converter.arrayListToArray(arrayList);
                    System.out.println("Converted back to Array: " + Arrays.toString(newArray));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
}
