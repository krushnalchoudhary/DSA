import java.util.*;

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

        System.out.println("Array before removing duplicates");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        int k = removeDuplicates(arr);

        System.out.println("Array After removing Duplicates");

        for (int i = 0; i < k; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static int removeDuplicates(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int k = set.size();
        int j = 0;

        for (int x : set) {
            arr[j++] = x;
        }

        return k;
    }
}
