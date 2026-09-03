import java.util.Scanner;
class MergeElement {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[]arr=new int[5];
		int[]brr=new int[5];
		
		//input for user Array1
		System.out.println("Enter a 5 element : ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		//Input form User array2
		System.out.println("Enter a 5 element : ");
		for(int i=0; i<brr.length; i++) {
			brr[i]=sc.nextInt();
		}
		
		//Display Array1
		System.out.print("Array1 = [ ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		
		//Display Array2
				System.out.print("Array2 = [ ");
				for(int i=0; i<brr.length; i++) {
					System.out.print(brr[i] + " ");
				}
				System.out.print("]");
				System.out.println();
				
		//Merge Array Logic 
			int[]crr=new int[10];
			for(int i=0; i<arr.length; i++) {
				crr[i]=arr[i];
			}
			for(int i=0; i<brr.length; i++) {
				crr[i+5]=brr[i];
			}
			// Display merge array 
			System.out.print("merge Array = [ ");
			for(int i=0; i<crr.length; i++) {
				System.out.print(crr[i] + " ");
			}
			System.out.print("]");
			sc.close();

	}

}
