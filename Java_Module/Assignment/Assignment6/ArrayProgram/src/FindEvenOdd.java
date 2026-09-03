import java.util.Scanner;
class FindEvenOdd {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[]arr= new int[10];
		
		//Input Array
		System.out.println("Enter a 10 element : ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt(10);
		}
		
		//Display Array
		System.out.print("Array = [");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		
		//Find Even And Odd number in the Array
		System.out.print("Even Number : [ ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0)
				System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		System.out.print("Odd Number : [ ");
		for(int i=0; i<arr.length; i++) {
			if (arr[i]%2 != 0)
				System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		sc.close();

	}

}
