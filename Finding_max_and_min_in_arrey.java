package java_world;
import java.util.Scanner;
public class Finding_max_and_min_in_arrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the characters");
		int arr[]=new int[10];
		for(int i=0; i<10; i++) {
			arr[i]=scn.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<10; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The max number is: " +max);
		System.out.println("The min number is: " +min);
	}

}
