package Enum;

public class EnumClass {
	public enum Days 
	{
		Sunday(10),Monday(5),Tuesday(3),Wednesday(9),Thursday(8),Friday(7),Saturday(1);
	
	private int val;
	private Days(int val){
		this.val=val;
	}
	
    }
	public static void main(String[] args){
		for(Days d: Days.values()){
			System.out.println(d +" "+d.val);
		}
	}

}
