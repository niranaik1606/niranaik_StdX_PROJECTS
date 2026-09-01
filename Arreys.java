package java_world;
import java.util.Scanner; 
public class Arreys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int x[]=new int[10];
		for(int i=0; i<10; i++)
		{
			x[i]=scn.nextInt();
		}
		for(int i=0; i<10; i++)
		{
			System.out.println(x[i]);
		}
	}

}
