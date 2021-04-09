package JavaPrograms;

import java.util.Scanner;

public class ElectricalBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0,count=0;
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter House or Commercial: ");
		a=sc.nextLine();
		System.out.println("Enter no.of units: ");
		n=sc.nextInt();
		if(a.toLowerCase().contains("house"))
		{
		if(n>=1 && n<=100)
		{
		count=n*3;
		}
		else
		count=n*4;
		}
		if(a.toLowerCase().contains("commercial"))
		{
		if(n>=1 && n<=100)
		{
		count=n*10;
		}
		else
		count=n*20;
		}
		System.out.println("Final billing amount: "+count);
	}

}