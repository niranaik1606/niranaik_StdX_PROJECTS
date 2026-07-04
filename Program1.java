
package java_world;
import java.util.Scanner;


public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the word: ");
		String st1=scn.next();
	int n=st1.length();
	for(int i=0;i<n;i++) {
		System.out.println(st1.charAt(i));
		
		}
	System.out.println(st1.toLowerCase());
		System.out.println(st1.toUpperCase());
	
	}	

}