package java_world;
import java.util.Scanner; 

public class Arrey_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		char ch[]=new char[5];
		for(int i=0; i<5; i++)
		{
			ch[i]=scn.next().charAt(0);
		}
		for(int i=0; i<5; i++)
		{
			System.out.println(ch[i]);
		}
	}

}
