import java.util.Scanner;

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

    void setDow(String w) {
        this.dow = w;
    }
	int getDay(){
	return this.day;
	}
	int getMonth(){
	return this.month;
	}

	int getYear(){
	return this.year;
	}
	String getDow(){
	return this.dow;
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
	
	Scanner s;
	s=new Scanner(System.in);

        Date d1;
        d1 = new Date();

	System.out.println("Enter Day");
	int d=s.nextInt();
	d1.setDay(d);

	System.out.println("Enter month");
	int m=s.nextInt();
	d1.setMonth(m);

	System.out.println("Enter year");
	int y=s.nextInt();
	d1.setYear(y);

	System.out.println("Enter Day of week");
	s.nextLine();
	String dow=s.nextLine();
	d1.setDow(dow);
	
	d1.display();
            

          }
}