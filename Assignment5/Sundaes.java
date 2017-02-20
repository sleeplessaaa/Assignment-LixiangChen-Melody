package assignment5;

public class Sundaes extends IceCream{

	private String type; 
	private int sundaeCost;

	public Sundaes(String iceCreamType, int iceCreamCost, String sundaeType, int sundaeCost){
		super(iceCreamType, iceCreamCost);
		this.type = sundaeType;
		this.sundaeCost = sundaeCost;
	}


	public int getCost(){
		int total = super.getCost() + this.sundaeCost; 
		return total; 
	}

	public String getSundaeType(){
		String s = this.type + " Sundae with ";
		return s; 
	}
	public String getSundaeIceCreamType(){
		String s = super.getName();
		return s; 
	}
}