import java.util.Scanner;

class UserInput {
    Scanner scan = new Scanner(System.in);

    int[] getArrayInput() {
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }
}
