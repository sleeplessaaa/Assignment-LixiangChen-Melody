package test;

public class Customer {
    String customerName;
    double totalPrice = 0;
    
    public Customer(String customerName){
    	this.customerName = customerName;
    }
    
    public String getCustomerName(){
    	return this.customerName;
    }
 
    public double purchase(Book book){
    	totalPrice = totalPrice + book.getPrice();
    	return totalPrice;
    }
    
}
