class Date {
    int day;
    int month;
    int year;
    String dow;
	
	Date(){
	System.out.println("Default Constructor called");
	this.day=15;
	this.month=8;
	this.year=1947;
	this.dow="Friday";
	}
	Date(int d,int m,int y,String dow){
	System.out.println("Paramaterized Constructor called");

	this.day=d;
	this.month=m;
	this.year=y;
	this.dow=dow;
	}

    void setDay(int d) {
        day = d;
    }

    void setMonth(int m) {
        month = m;
    }

    void setYear(int y) {
        year = y;
    }
	void setDow(String s)
	{
	dow=s;
	}
void display()
{
System.out.println("Day is: "+this.day);
System.out.println("Month is : " + this.month);
System.out.println("Year is : " +this.year);
System.out.println("Day of week is : " + this.dow);

}
}

class TestDate {
    public static void main(String args[]) {
        
        Date d1;          // Reference
        d1 = new Date();  // Object creation
	d1.display();
	
	Date d2=new Date(25,8,2026,"Thuesday");
	d2.display();
	
        
            }
}