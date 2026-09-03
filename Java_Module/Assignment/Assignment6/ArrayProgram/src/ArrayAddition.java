import java.util.Scanner;
class ArrayAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr1=new int[5];
		int[]arr2=new int[5];
		int[]arr3=new int[5];
		
		//Input Array1
		System.out.println("Enter 5 Element for Array1 : ");
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		//Input Array2
		System.out.println("Enter 5 Element for Array2 : ");
				for(int i=0; i<arr1.length; i++) {
					arr2[i]=sc.nextInt();
		}
		//Display Array1
		System.out.print("Array1 = [");
				for(int i=0; i<arr1.length; i++) {
					System.out.print(arr1[i] +" ");
				}
				System.out.print("]");
				System.out.println();
		//Display Array2
		System.out.print("Array2 = [");
				for(int i=0; i<arr2.length; i++) {
					System.out.print(arr2[i] +" ");
				}
				System.out.print("]");
				System.out.println();
		//Addition of Array1 and Array2 into Array3
				for(int i=0; i<arr3.length; i++) {
					arr3[i]=arr1[i]+arr2[i];
				}
		//Display Array3
		System.out.print("Array3 = [");
				for(int i=0; i<arr3.length; i++) {
					System.out.print(arr3[i] +" ");
				}
				System.out.print("]");
				sc.close();
	}

}
