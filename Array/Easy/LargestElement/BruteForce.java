import java.util.Scanner;

class LargestElement {
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

        int temp = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }

        System.out.println("Largest element is: " + temp);
    }
}
