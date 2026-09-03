import java.util.Scanner;
class FindSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr=new int[10];
		
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
		
		//find the sum of Array
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum = "+sum);
		sc.close();
	}

}
