package java_world;
import java.util.Scanner; 
public class TwoD_Arrey_of_3x3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn=new Scanner(System.in);
		int IId[][]=new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
			{
				IId[i][j]= scn.nextInt();
			}
	}
 
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
			{
				System.out.print(IId[i][j]+ " ");
	
	}		System.out.println();
}}}

