package JavaPrograms;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter Month: ");
		i=sc.nextInt();
		if(i>=1 && i<=4)
			System.out.println("Given month belongs to Summer Season");
		else if(i>=5 && i<=8)
			System.out.println("Given month belongs to Winter Season");
		else if (i>=9 && i<=12)
			System.out.println("Given month belongs to Rainy Season");
		else
			System.out.println("Enter valid month");
	}

}
