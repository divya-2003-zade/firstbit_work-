import java.util.Scanner;

class SearchArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        // Input
        System.out.println("Enter 10 Elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Display Array
        System.out.print("Array = [ ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("]");

        // Search Element
        System.out.print("Enter an Element to Search: ");
        int ele = sc.nextInt();

        int flag = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ele) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}
