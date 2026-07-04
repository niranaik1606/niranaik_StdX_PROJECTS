package java_world;
import java.util.Scanner;


public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		//System.out.println("Enter the word: ");
		String st1=scn.nextLine();
		
		int n=st1.length();
		//System.out.println("The length of the sting " + n);
		
		int count=0;
		for(int i=0;i<n;i++) {
			char c=st1.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
			{
				count=count+1;
			}
		}
		System.out.println("The number+ count " + count);
	}

}