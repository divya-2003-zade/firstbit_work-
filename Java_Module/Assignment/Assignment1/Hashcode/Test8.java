class SalesManager{
	int id;
	String name;
	double salary;
	double incentive;
	int target;
}
class SalesManagerData{
	public static void main(String args[])
	{
	System.out.println("SalesManager Details");
	SalesManager sm1;//reference
	sm1=new SalesManager();
	System.out.println(sm1);
	}
}