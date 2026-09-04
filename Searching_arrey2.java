package java_world;

public class Searching_arrey2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]=new int[] {2,65,78,8,4};
		System.out.println(Searching(x, 8));
	}
	
	public static int Searching(int x[], int search)
	{
		for(int i=0; i<x.length; i++)
		{
			if(x[i]==search)
			{
				return 1;
			}
			
		}
		return 0;
	}
	

}
