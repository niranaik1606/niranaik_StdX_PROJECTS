package java_world;
import java.util.Scanner;
public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks= scn.nextInt(); 
		
		if(marks>80) {
			System.out.println("A");
		}else if(marks>60 && marks<80) {
			System.out.println("B");
		}else if(marks>40 && marks<60) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	
	}

}
