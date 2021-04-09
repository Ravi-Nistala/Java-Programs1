package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int i,num,count=0;
		System.out.println("Enter Number: ");
		num=sc.nextInt();
		for(i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				count=1;
				break;
			}
		}
		if(num==1||num==0)
			System.out.println("Given Number ("+num+") is a Prime Number");
		else if(count==0) 
			System.out.println("Given Number ("+num+") is a Prime Number");
		else
			System.out.println("Given Number ("+num+") is not a Prime Number");
	}

}
