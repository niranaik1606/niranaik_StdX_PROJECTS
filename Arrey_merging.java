package java_world;

public class Arrey_merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar1[]=new int[] {4,-1, 2};
		int ar2[]=new int[] {1, 3, -2, 0, 5};
		int n=ar1.length;
		int m=ar2.length;
		int Finar[]=new int[m+n];
		for(int i=0; i<ar2.length; i++)
		{
			Finar[1]=ar1[i];
		}
		for(int i=0; i<ar2.length; i++)
		{
			Finar [i+n]=ar2[i];
		}
// print the arrey
	}

}
