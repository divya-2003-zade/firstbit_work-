class Date{
	int day;
	int month;
	int year;
	String dow;
	void setDay(int d){
	day=d;
	}
	void setMonth(int m){
	month=m;
	}
	void setYear(int y){
	year=y;
	}
	void setDow(String s){
	dow=s;
	}

	}
class TestDate{
	public static void main(String args[])
	{
	Date d1;//reference
	d1=new Date();//class variable

	d1.setDay(21);//function call
	d1.setMonth(8);
	d1.setYear(2026);
	d1.setDow("Monday");

	//java internally set this setDay(d1,21);
	System.out.println("Day is : "+d1.day);
	System.out.println("Month is : "+d1.month);
	System.out.println("Year is : "+d1.year);
	System.out.println("Days of the week : "+d1.dow);
	}
} 