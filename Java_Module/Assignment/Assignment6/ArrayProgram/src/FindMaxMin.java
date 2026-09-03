import java.util.Scanner;
class FindMaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr= new int[10];
		
		//input array
		System.out.println("Enter the 10 number : ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt(10);
		}
		
		//Display Array
		System.out.print("Array : [ ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		
		//Find the Maximum and Minimum
		int max =arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("The Maximum Number is = " + max);
		System.out.println("The Minimum Number is = " + min);
		sc.close();

	}

}
