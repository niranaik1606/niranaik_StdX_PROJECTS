package java_world;

import java.util.Scanner;

public class Step_tracker {

	String name;
	int sw;
	double cb;
	double km;
	Scanner scn=new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter your name");
		name=scn.next();
		System.out.println("Enter the steps");
		sw=scn.nextInt();
	}
	public void calculated() {
		km=sw/1300;
		cb=0.04*sw;
	}
	public void display() {
		System.out.println("name "+name);
		System.out.println("sw "+sw);
		System.out.println("cb "+cb);
		System.out.println("km "+km);
	}
	public static void main(String[] args) {
		Step_tracker stp=new Step_tracker();
		stp.accept();
		stp.calculated();
		stp.display();
	}

}
