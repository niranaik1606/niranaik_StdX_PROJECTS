package java_world;
import java.util.Scanner; 
public class TwoD_Arreys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int IId[][]=new int[2][4];
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++)
			{
				IId[i][j]= scn.nextInt();
			}
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++)
			{
				System.out.print(IId[i][j]+ " ");
	
	}		System.out.println();
}
	}}
