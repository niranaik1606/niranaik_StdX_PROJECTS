package java_world;
import java.util.Scanner; 
public class Perimeter_and_area_of_the_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter length: ");
		double length= scn.nextDouble(); //To calculate the length
		System.out.println("Enetr the choice");
		System.out.println("1. The perimeter of the square");
		System.out.println("2. The area of the square");
		int ch= scn.nextInt();

		switch(ch) {
		case 1: System.out.println("The perimeter of the square: "+ 4*length);
		break;
		
		case 2: System.out.println("The area of the square: "+ length*length);
		break;
		
		default: System.out.println("Invalid choice");
	}

	}}
