package test;

public class Car {
	 String carName;
	 double carNumber;
	 double carPrice;

     
	 public Car(String carName,double carNumber, double carPrice){
		 this.carName = carName;
		 this.carNumber = carNumber;
		 this.carPrice = carPrice;
	 }
	 
	 public void setCarName(String carName){
		 this.carName = carName;
	 }
	 
	 public void setCarNumber(double carNumber){
		 this.carNumber = carNumber;
	 }
	 
	 public void setCarPrice(double carPrice){
		 this.carPrice = carPrice;
	 }
	 
	  public String getCarName(){
	      	return this.carName;
	      }
	 
	  public double getCarNumber(){
	      	return this.carNumber;
	      }
	 
     public double getCarPrice(){
     	return this.carPrice;
     }
     
}
