import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BruteForce {
    public static void main(String[] args) {
        System.out.println("Enter Array1 Size:");
        int size1 = 0;

        Scanner sc = new Scanner(System.in);
        size1 = sc.nextInt();

        System.out.println("Enter Array2 size");

        int size2 = 0;
        size2 = sc.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        System.out.println("Enter array1 elements:");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter array2 elements:");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }

        System.out.print("]");

        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }

        System.out.print("]");

        ArrayList<Integer> Union = findUnion(arr1, arr2);

        for (int val : Union) {
            System.out.println(val + " ");
        }

    }

    static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
        }

        for (int i = 0; i < arr1.length; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
        }
        for (int it : freq.keySet())
            Union.add(it);

        return Union;
    }
}
