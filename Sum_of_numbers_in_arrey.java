package java_world;
import java.util.Scanner; 

public class Sum_of_numbers_in_arrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int x[]=new int[10];
		for(int i=0; i<10; i++)
		{
			x[i]=scn.nextInt();
		}
		int sum_one=0;
	    int sum_two=0;
	    for(int i=0; i<x.length; i++)
	    {
	    	if (x[i]>=0 && x[i]<=9) {
	    		sum_one+=x[i];
	    	}
	    	else if (x[i]>=10 && x[i]<=99);{
	    		sum_two+=x[i];
	    	}
	    }
	    System.out.println("Sum of one digit nos."+ sum_one);
	    System.out.println("Sum of one digit nos."+ sum_two);
	}

}
