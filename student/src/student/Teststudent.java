package student;

public class Teststudent {
	 public static void main(String[] args){
	        Student student1=new Student(1,"Addy","CSEAI",'C');//parameterized constructor
	        Student student2=new Student();//default constructor
	        Student student3=new Student(student1);
//	        Student.collegeName="IIT GUWAHATI";
//	        student1.Department="AI";
//	        
//	        student1.RollNo=1;
//	        student1.Section='C';
//	        student1.displayInfo();
//	        student1.playing();
//	        student1.studying(6);
//	        student2.displayInfo();
//	        student2.studying(9);
//	        student3.displayInfo();
	        Regularclass rs= new Regularclass(49,"Rashi","CSEAI",'C',95,"H506");
	        rs.displayInfo();
	        rs.payfee();
	       // student1.payfee();
	        onlinestu st1= new onlinestu(50,"Shubh","CSEAIML",'C',"Zoom","89 kbps");
	        st1.displayInfo();
	        st1.payfee();
	        
	        Hostelstu hs=new Hostelstu(49,"Rashi","CSEAI",'C',95,"H506","gargi");
	        hs.displayInfo();
	        
	    }
}
