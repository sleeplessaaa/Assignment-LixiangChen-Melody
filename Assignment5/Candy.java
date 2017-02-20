package assignment5;

public class Candy extends DessertItem{
	private int pricePerPound;  
	private double lb; 

  public Candy(){
    super();
    this.pricePerPound = 0; 
    this.lb = 0; 
  }

  public Candy(String name, double weight, double price) {
    super(name);
    this.pricePerPound = (int) price;
    this.lb = weight; 
  }


  public int getCost(){
    if (this.lb != 0 && this.pricePerPound != 0 ){
      double cost = (this.pricePerPound*1.0) * this.lb;
      int costInt = (int)Math.round(cost);
      return costInt;
    } else {
      System.out.println("Price and/or weight has not been set for " + this.name + ". Cost returned is $0.");
      int cost = 0; 
      return cost; 
    }
  }

  public String getListPrice(){
    String s = this.lb + " lbs. @ " + DessertShoppe.cents2dollarsAndCents(this.pricePerPound) + " /lb."; 
    return s;
  }
	
}