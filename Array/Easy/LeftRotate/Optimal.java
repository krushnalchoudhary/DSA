//

import java.util.Scanner;

public class Optimal {
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

        System.out.println("Enter places to rotate");
        int N = sc.nextInt();

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.print("]");
        int rotatedarray[] = rotateArray(arr, N);

        System.out.println("");

        for (int i = 0; i < rotatedarray.length; i++) {
            System.out.print("[" + rotatedarray[i] + "]");
        }

    }

    static int[] rotateArray(int arr[], int N) {
        N = N % arr.length;

        int temp[] = new int[N];

        for (int i = 0; i < N; i++) {
            temp[i] = arr[i];
        }

        for (int i = N; i < arr.length; i++) {
            arr[i - N] = arr[i];
        }

        for (int i = arr.length - N; i < arr.length; i++) {
            arr[i] = temp[i - (arr.length - N)];
        }

        return arr;
    }
}
