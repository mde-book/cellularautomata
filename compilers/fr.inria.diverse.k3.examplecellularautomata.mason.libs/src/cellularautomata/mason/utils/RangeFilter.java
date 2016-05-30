package cellularautomata.mason.utils;

public class  RangeFilter{
	int lower; 
	int upper;
	public RangeFilter(int lower, int upper){
		this.lower = lower;
		this.upper = upper;
	}
	public boolean isInFilter(int checkedVal){
		return lower <= checkedVal && checkedVal <= upper;
	}
}
