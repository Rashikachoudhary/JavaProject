package student;

public class onlinestu extends Student{
	String platform;
	String Internetspeed;
	public onlinestu(int RollNo,String Name,String Department,char Section,String platform,String Internetspeed) {
		super(RollNo,Name,Department,Section);
		this.platform=platform;
		this.Internetspeed=Internetspeed;
	}
	public void payfee() {
		super.payfee();
		System.out.println("The student has paid the "+platform +" platform fee");
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Student's platform is "+ platform +" and is connected with speed "+Internetspeed);
	}

}

