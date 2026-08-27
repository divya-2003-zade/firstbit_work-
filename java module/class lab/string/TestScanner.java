import java.util.Scanner;

class TestScanner{
	public static void main(String args[]){
	String s1="Hello";
	String s2="Hello";
	String s3=new String("Hello");
	
	if(s1==s2){
	 System.out.println("Equal!!");
	}else
	{
	 System.out.println("Not Equal!!");
	}

	if(s1==s3){
	 System.out.println("Equal!!");
	}else
	{
	 System.out.println("Not Equal!!");
	}
	
	if(s1.equals(s3)){
	 System.out.println("Equal!!");
	}else
	{
	 System.out.println("Not Equal!!");
	}


	

		}
}
