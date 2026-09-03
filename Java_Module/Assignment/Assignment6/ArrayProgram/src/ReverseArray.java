import java.util.Scanner;
class ReverseArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[]arr = new int[10];
		
		//Input an Array 
		System.out.println("Enter a 10 Number : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//display an Array
		System.out.print("Array = [ ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		
		//Revesse Logic 
		System.out.println("Reversing an Array : ");
		int temp;
		for(int i=0; i<arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length -1-i];
			arr[arr.length-1-i] = temp;
			
		}
		
		//Display the reverse array
		System.out.print("Reverse Array = [ ");
		for (int i = 0; i < arr.length; i++) {
		    System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		sc.close();
	}

}
