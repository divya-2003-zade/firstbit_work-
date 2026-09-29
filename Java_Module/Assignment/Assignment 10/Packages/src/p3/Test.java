package p3;

import java.util.Scanner;

import p1.Employee;
import p2.Admin;
import p2.HR;
import p2.SaleManager;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] emp = new Employee[3];
		 // HR
        System.out.println("Enter HR details:");

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Commission: ");
        double commission = sc.nextDouble();

        emp[0] = new HR(id, name, salary, commission);

     // SalesManager
        System.out.println("\nEnter Sales Manager details:");

        System.out.print("Enter ID: ");
        id = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter Incentive: ");
        double incentive = sc.nextDouble();

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        emp[1] = new SaleManager(
                id, name, salary, incentive, target);
        
     // Admin
        System.out.println("\nEnter Admin details:");

        System.out.print("Enter ID: ");
        id = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter Allowance: ");
        double allowance = sc.nextDouble();

        emp[2] = new Admin(
                id, name, salary, allowance);

     // Display details
        System.out.println("\n===== Employee Details =====");

        for (Employee e : emp) {

            System.out.println(e);

            System.out.println(
                "Calculated Salary: " + e.calSal()
            );

            System.out.println("-----------------------------");
        }

        sc.close();

	}
}
