import java.util.Scanner;
class FindPrimeNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[]arr = new int[10];
		
		//Input Given form the user
		System.out.println("Enter a 10 Element : ");
		for(int i= 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		//Display the Array
		System.out.print("Array = [ ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		
		//Prime Logic Code
		System.out.print("Prime Number : [ ");
		for(int i=0; i<arr.length; i++) {
			int flag=0;
			for(int j=2; j<arr[i]; j++) {
				if(arr[i]%j==0) {
					flag=1;
					break;
				}
			}
			if (flag==0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("]");
		System.out.println();
		sc.close();
		

	}

}
