package tuple;

public class TruckService {
	
	private int year;
	private long count;
	
	
	public TruckService(int year, long count) {
		super();
		this.year = year;
		this.count = count;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	
	

}
