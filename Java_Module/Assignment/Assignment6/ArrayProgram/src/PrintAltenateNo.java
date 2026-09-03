import java.util.Scanner;
class PrintAltenateNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr= new int[10];
		
		//input form the user 
		System.out.print("Enter a 10 Element : ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			}
		
		//Display the Array
		System.out.print("Array =[ ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		
		//Print the Alternate 
		System.out.print("Alternate Array = [ ");
		for (int i=0; i<arr.length; i+=2) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		sc.close();

	}

}
