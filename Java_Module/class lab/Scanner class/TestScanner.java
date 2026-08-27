import java.util.Scanner;
class TestScanner{
	public static void main(String args[]){
	Scanner s;
	s=new Scanner(System.in);
	System.out.println("Enter any number");
	int a=s.nextInt();
	System.out.println("Value of a= "+a);
	 System.out.println("Enter any string");
	s.nextLine();
	String str=s.nextLine();
	System.out.println("Value of str = "+str);
	}
}

