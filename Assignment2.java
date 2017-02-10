//score: 9.5 + 1
//comments: good job! 
class Employee {
	String name;
    int age;
    Gender gender;
    double salary;// salary per month

	
    public void raiseSalary(double byPercent) {
    	double raise;
    	raise = byPercent* this.salary/100;
    	this.salary += raise;
    	System.out.println( this.salary );
    }

    public Employee(String name, int age, Gender gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

enum Gender {
    MALE,
    FEMALE;
}

public class Assignment2 {
	// Assignment
    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {                     //correct
    	double socialSecurityTax;
    		 if (employee.salary <= 8900) {
    			  socialSecurityTax = 0.062*employee.salary;
    	            System.out.println(socialSecurityTax);
    	            return socialSecurityTax;
    		 }
    		 else {
    			 socialSecurityTax = 0.062*106800;
 	             System.out.println(socialSecurityTax);
 	             return socialSecurityTax;
    		 }
    	 }
        //write your code here

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {                //correct
    	double insuranceCoverage;
    	if (employee.age <= 35){
    		insuranceCoverage = 0.03*employee.salary;
    		System.out.println ( insuranceCoverage);
    	    return  insuranceCoverage;
    	} else if (employee.age <= 50 && employee.age > 35) {
    		insuranceCoverage = 0.04*employee.salary;
    		System.out.println ( insuranceCoverage);
    	    return  insuranceCoverage; 
    	} else if (employee.age <= 60 && employee.age > 50) {
    		insuranceCoverage = 0.05*employee.salary;
    		System.out.println (insuranceCoverage);
    	    return  insuranceCoverage;
    	} else {
    		insuranceCoverage = 0.06*employee.salary;
    		System.out.println (insuranceCoverage);
    	    return  insuranceCoverage;
    	}
    }
        //write your code here

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {       //It requires to sort from low to high, but your answer is high to low
    	double max = 0; 
    	double x = 0;
    	double y = 0;
    	String maxName, xName, yName;
    	if (e1.salary > e2.salary && e1.salary > e3.salary) {
    		max = e1.salary;
    		x = e2.salary;
    		y = e3.salary;
    		maxName = e1.name;
    		xName = e2.name;
    		yName = e3.name;
    	}
    	else if (e2.salary > e1.salary && e2.salary > e3.salary) {
    		max = e2.salary;
    		x = e1.salary;
    		y = e3.salary;
    		maxName = e2.name;
    		xName = e1.name;
    		yName = e3.name;
    	}
    	else {
    		max = e3.salary;
    		x = e1.salary;
    		y = e2.salary;
    		maxName = e3.name;
    		xName = e1.name;
    		yName = e2.name;
     	}
    	
    	if (x > y){
    		System.out.print(maxName);
			System.out.print(" ");
			System.out.print(xName);
			System.out.print(" ");
			System.out.println(yName);
    	}
    	else {
    		System.out.print(maxName);
			System.out.print(" ");
			System.out.print(yName);
			System.out.print(" ");
			System.out.println(xName);
    	}
    }
        //write your code here
    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {                 //correct
    	employee.salary = 3*employee.salary;
    }
    
        //write your code here

    //Interview prepare questions

    /**
     * Write a method to determine whether a number is prime
     */
    public boolean isPrime(int n) {            //correct
    	int i=0;
        if(n<2)
            return false;
        for(i=2; i<n; i++) {
            if(n%i==0)
                break;
        }
        if(i>=n)
            return true;
        return false;
    }
        //write your code here

    /**
     * Given a non-negative integer n, repeatedly add all its digits until the
     * result has only one digit. For example: Given n = 38, the process is
     * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {       //correct
    	while (n / 10 > 0) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;  
    }
        //write your code here

    /**
     * Write a program to check whether a given number is an ugly number. Ugly
     * numbers are positive numbers whose prime factors only include 2, 3, 5.
     * For example, 6, 8 are ugly, while 14 is not ugly since it includes
     * another prime factor 7. Note that 1 is typically treated as an ugly
     * number.
     */
    public boolean isUgly(int n) {                    //correct
    	if (n <= 0) {
    		return false;
    	}
    	while (n % 2 == 0)n /= 2;
    	while (n % 3 == 0)n /= 3;
    	while (n % 5 == 0)n /= 5;
    	
    	if (n == 1){
    		return true;
    	}
    	else{
    		return false;
    	}	
    }
        //write your code here

    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    //correct
    /*
     *write your understanding here.
     *Because Java is pass-by-value,that means pass-by-copy.So the method can not change
     *the bits that were in the calling variable x.In my understanding, in this case, 
     *the swap only pass the value of object,which are not the object itself. So no matter
     * what happen in the swap function,it will not affect the created objects itself.
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}
