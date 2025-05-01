
import java.util.ArrayList;
import java.util.Scanner;

public class BruteForce {
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

        int[] updatedArray = moveZeroestoEnd(arr);

        for (int i = 0; i < updatedArray.length; i++) {
            System.out.print(updatedArray[i] + " ");
        }
    }

    static int[] moveZeroestoEnd(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        for (int i = temp.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }
}
