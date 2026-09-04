package java_world;

public class Creating_arrey3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[]=new int[] {4,-1, 3, 17, -5, -14, 19, 10};
		System.out.println(Searching(x, 19));
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
