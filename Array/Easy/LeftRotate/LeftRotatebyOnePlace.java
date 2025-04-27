
import java.util.Scanner;

public class LeftRotatebyOnePlace {
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

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.print("]");
        int rotatedarray[] = rotateArray(arr);

        System.out.println("");

        for (int i = 0; i < rotatedarray.length; i++) {
            System.out.print("[" + rotatedarray[i] + "]");
        }

    }

    static int[] rotateArray(int arr[]) {
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;

        return arr;
    }

}
