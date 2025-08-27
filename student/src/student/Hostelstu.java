package student;

public class Hostelstu extends Regularclass{ 
	//default constructor hona chahiye vrna run nhi hoga
	String Hostelname;
	
	
	public Hostelstu(int RollNo,String Name,String Department,char Section,int attend_per,String classroom,String Hostelname) {
		super(RollNo,Name,Department,Section,attend_per,classroom);
		this.Hostelname=Hostelname;
	}

}
