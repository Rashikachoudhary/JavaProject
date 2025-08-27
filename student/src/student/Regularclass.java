package student;

public class Regularclass extends Student{
	int attend_per;
	String classroom;
	public Regularclass(int RollNo,String Name,String Department,char Section,int attend_per,String classroom) {
		super(RollNo,Name,Department,Section);
		this.attend_per=attend_per;
		this.classroom=classroom;
	}
	public Regularclass(){
		
	}
	public void submitAssignment() {
		System.out.println("Submitted the assignment");
	}
	public void payfee() {
		super.payfee();
		System.out.println("The student in classroom "+ classroom+" has paid the tution + lab fee + platform fee");
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("The attendance of student is "+ attend_per+" and the classroom is "+classroom);
	}

}
