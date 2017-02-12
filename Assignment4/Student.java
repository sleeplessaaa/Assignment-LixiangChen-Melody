package test;

public class Student {

	String studentName;
    int id;
	
	public String getStudentName(){
		return this.studentName;
	}
	
	public int getStudentId(){
		return this.id;
	}
	
    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.id = id;
    }
}
