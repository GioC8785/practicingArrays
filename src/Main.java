import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4};
        int [] arr1 = {3,4,5,6};
        int [] transferArray = new int[8];



        for (int i = 0; i < arr.length ;i++){

            transferArray [i] = arr[i];
            transferArray [i + arr.length] = arr1[i];
        }
        System.out.println(Arrays.toString(transferArray));
    }
}