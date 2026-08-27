class Date {
    int day;
    int month;
    int year;
    String dow;

    void setDay(int d) {
        this.day = d;
    }

    void setMonth(int m) {
        this.month = m;
    }

    void setYear(int y) {
        this.year = y;
    }

    void setDow(String s) {
        this.dow = s;
    }
	int getDay(){
	return this.day;
	}

    void display() {
        System.out.println("Day is : " + this.day);
        System.out.println("Month is : " + this.month);
        System.out.println("Year is : " + this.year);
        System.out.println("Day of week is : " + this.dow);
    }
}

class TestDate {
    public static void main(String args[]) {

        Date d1;
        d1 = new Date();

        d1.setDay(21);
        d1.setMonth(8);
        d1.setYear(2026);
        d1.setDow("Monday");
	
	Date d2;
	d2=new Date();
	d2.setDay(27);
        d2.setMonth(8);
        d2.setYear(2026);
        d2.setDow("Monday");
	
	if(d1.getDay()>d2.getDay()){
	System.out.println("d2 is elder!!");
	}
	else{
	System.out.println("d1 is elder!!");
	}
    

          }
}