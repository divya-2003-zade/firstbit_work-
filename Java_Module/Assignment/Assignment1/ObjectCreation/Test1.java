class Date{
	int day;
	int month;
	int year;
	String dow;
}
//class date end here
class Test{
	public static void main(String args[]){
	Date d1;//reference
	d1=new Date();//class ka variable
	d1.day=21;
	d1.month=8;
	d1.year=2026;
	d1.dow="Friday";
	System.out.println("day is "+d1.day);
	System.out.println("Month is "+d1.month);
	System.out.println("Year is "+d1.year);
	System.out.println("Day of week "+d1.dow);

	

}
}