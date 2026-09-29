package p1;

import java.util.Scanner;

public class AdmissionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student Name :");
		String name =sc.nextLine();
		
		System.out.print("Enter age:");
		int age =sc.nextInt();
		
		System.out.print("Enter Percentage :");
		double percentage =sc.nextDouble();
		
		
		System.out.print("Enter total fees :");
		double totalFees =sc.nextDouble();
		
		System.out.print("Enter paid fees :");
		double paidFees =sc.nextDouble();
		
		AdmissionForm form = new AdmissionForm(name,age,percentage,totalFees,paidFees); 
			try {
				form.validateForm();
				System.out.println("Admission Successfully!!");
			}catch (EmptyNameException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (UnderageException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (InvalidPercentageException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (NotFitForAdmissionException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (FeesNotPaidException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (InsufficientFeesException e) {
	            System.out.println(e.getMessage());
	        }	
			sc.close();
	}
}
