package test;

public class Courses {

	 String className;
	 int numberOfStudent;
	 Student[] list= new Student[10];
	  
	 public Courses(String title){
		 this.className = title;
	 }
	 
	 public String getClassName(){
		 return this.className;
	 }
	 
     public int getNumberOfStudent(){
    	 return this.numberOfStudent;
     }
	
     public Student[] getStudents(){
    	 return this.list;
     }
     
	 public boolean isFull(){
		 return(this.numberOfStudent == 10);
	 }
	 
     public void registerStudent(Student student){
    	 if(this.isFull()){
    		 return;
    	 }else{
    		 this.numberOfStudent++;
    		 this.list[numberOfStudent] = student;
    	 }
    	 
     }
	 
}
