class Time{
	int hr;
	int min;
	int sec;
	Time() {
		this.hr = 0;
		this.min = 0;
		this.sec = 0;
	}
	Time(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	int getHr() {
		return hr;
	}
	void setHr(int hr) {
		this.hr = hr;
	}
	int getMin() {
		return min;
	}
	void setMin(int min) {
		this.min = min;
	}
	int getSec() {
		return sec;
	}
	void setSec(int sec) {
		this.sec = sec;
	}
	void display() {
		System.out.printf("%d: %d: %d\n", hr, min, sec);
	}
	
	void add(Time t) {
		Time t1 = new Time();
		t1.hr
	}
}
class TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
