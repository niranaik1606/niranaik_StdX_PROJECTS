package java_world;

public class Teacher_class {
	
	String Teachername;
	int Trcode;
	String subject;
	public void display() {
		System.out.println("The name of the teacher is: "+ Teachername);
		System.out.println("The teacher's code.: "+ Trcode);
		System.out.println(" The subject the teacher teaches: "+ subject);
	}
	Teacher_class(String Teachername, int Trcode, String subject){
		this.Teachername=Teachername;
		this.Trcode=Trcode;
		this.subject=subject;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher_class tr=new Teacher_class("Rudresh", 15, "Computer");
		tr.display();
		
		
		Teacher_class tchr=new Teacher_class("kunika", 10, "hindi");
		tchr.display();

	}

}
