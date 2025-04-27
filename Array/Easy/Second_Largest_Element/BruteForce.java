import java.util.Arrays;
import java.util.Scanner;

class SecondLargest1 {
    public static void main(String[] args) {
        System.out.println("Enter Array Size:");
        int size = 0;

        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        if (arr.length >= 2) {
            System.out.println("Second largest element is: " + arr[arr.length - 2]);
        } else {
            System.out.println("Array must have at least two elements!");
        }
    }
}
