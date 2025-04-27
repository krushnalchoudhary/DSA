import java.util.Scanner;

class SecondLargest2 {
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

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int SecondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > SecondLargest && arr[i] < largest && arr[i] != largest) {
                SecondLargest = arr[i];
            }
        }
        System.out.println(SecondLargest);
    }
}
