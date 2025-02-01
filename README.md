
This project includes multiple Java programs performing the following operations:

1)Separating even and odd numbers into different arrays 
2) Finding two neighboring numbers with the smallest distance 
3) Converting an array into an ArrayList and vice versa

This project is divided into five Java files

1) Main.java – The driver program that provides a menu-based selection for the user.
2) UserInput.java – Handles user input for arrays.
3) EvenOddSeparator.java – Separates even and odd numbers into different arrays.
4) SmallestNeighborDistance.java – Finds two neighboring numbers with the smallest difference.
5) ArrayConversion.java – Converts an array into an ArrayList and vice versa.

Features & Functions
1) Even and Odd Number Separation
void separateEvenOdd(int[] numbers)

Takes an array as input and separates even and odd numbers into two lists.
Uses ArrayLists to store and display even and odd numbers.

2) Finding the Smallest Neighbor Distance
int findSmallestDistance(int[] arr)

 Finds two neighboring numbers with the smallest difference in a given array.
Returns the index of the first number in the pair.


3) Converting Between Array and ArrayList
ArrayList<Integer> arrayToArrayList(Integer[] array)
Integer[] arrayListToArray(ArrayList<Integer> list)

Converts a given array into an ArrayList.
Converts an ArrayList back into an array.

1) Compile the Java files:

javac Main.java UserInput.java EvenOddSeparator.java SmallestNeighborDistance.java ArrayConversion.java

2) Run the program:
   java Main
