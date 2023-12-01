import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        enteringArray();
    }

    public static void enteringArray() {
        System.out.print("Size of the first array: ");
        int size1 = sc.nextInt();
        System.out.print("Size of the second array:");
        int size2 = sc.nextInt();

        int[] firstArr = new int[size1];
        int[] secondArr = new int[size2];
        int maxSize = Math.max(firstArr.length, secondArr.length);
        int[] transferArray = new int[size1 + size2];

        System.out.println("Enter " + size1 + " numbers:");
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = sc.nextInt();
        }
        System.out.println("Enter " + size2 + " numbers:");
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = sc.nextInt();
        }

        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                transferArray[i] = firstArr[i];
            }
            if (i < size2) {
                transferArray[i + firstArr.length] = secondArr[i];
            }
        }
        System.out.println(Arrays.toString(transferArray));
    }
}