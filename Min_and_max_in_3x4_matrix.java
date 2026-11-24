package java_world;
import java.util.Scanner;
public class Min_and_max_in_3x4_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the characters");
		int matr[][]=new int[3][4];
		for(int i=0; i<3; i++) {
			for(int j=0; j>4; j++) {
				matr[i][j]=scn.nextInt();
			}
		}
		int max=matr[0][0];
		int min=matr[0][0];
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++){
				if(matr[i][j]>max) {
					max=matr[i][j];
				}
				if(matr[i][j]<min) {
					min=matr[i][j];
				}
			}
		}
	}

}
