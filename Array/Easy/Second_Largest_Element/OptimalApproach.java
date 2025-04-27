import java.util.Scanner;

class SecondLargest3 {
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

        int secondLargest = SecondLargest(arr, arr.length);
        int secondSmallest = secondSmallest(arr, arr.length);

        System.out.println("Second Smallest element is " + secondSmallest);
        System.out.println("Second Largest element is " + secondLargest);
    }

    static private int SecondLargest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }

        int large = Integer.MIN_VALUE;
        int Second_Largest = Integer.MIN_VALUE;

        int i;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                Second_Largest = large;
                large = arr[i];
            }

            else if (arr[i] > Second_Largest && arr[i] != large) {
                Second_Largest = arr[i];
            }
        }

        return Second_Largest;
    }

    static private int secondSmallest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        return second_small;
    }
}
