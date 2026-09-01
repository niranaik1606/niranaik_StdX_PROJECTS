package java_world;
import java.util.Scanner; 
public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int x[]=new int[6];
		for(int i=0; i<6; i++)
		{
			x[i]=scn.nextInt();
		}
		for(int i=0; i<6; i++)
		{
			if(x[i]==17)
			{
				System.out.println("Found");
				break;
			}
		}
	}

}
