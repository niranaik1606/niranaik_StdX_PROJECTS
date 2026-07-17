package java_world;
import java.util.Scanner; 
public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter radius");
		double radius= scn.nextDouble();
		System.out.println("Enetr the choice");
		System.out.println("1. Circumference of the circle");
		System.out.println("2. Diameter of the circle");
		System.out.println("3. Area of the circle");
		int ch= scn.nextInt();
		
		switch(ch) {
		case 1: System.out.println("Circumference of the circle is "+ 2*3.14*radius);
		break;
		
		case 2: System.out.println("Diameter of the circle is "+2*radius);
		break;
		
		case 3: System.out.println("Area of the circle is "+ 2*radius*radius);
		break;
		
		default: System.out.println("Invalid choice");
		}
	}

}
