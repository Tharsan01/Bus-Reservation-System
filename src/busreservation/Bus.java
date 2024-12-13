package busreservation;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity; 
	
	Bus(int no,boolean ac,int cap){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	public int getCapacity(){
		return capacity;
	}
	public void setCapacity(int cap) {
		capacity = cap;
	}
	
	public boolean getAc(){
		return ac;
	}
	
	public void setAc(boolean val) {
		ac = val;
	}
	public int getBusNo(){
		return busNo;
	}
	
	public void displayInfo() {
		System.out.println("Bus No: " + busNo  + " Ac: " + ac + "  Capacity: " + capacity);
	}
	
	
}
