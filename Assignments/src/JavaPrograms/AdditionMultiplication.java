package JavaPrograms;

public class AdditionMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,sum=0,mul=1;
		for(i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		for(i=1;i<=10;i++)
		{
			mul=mul*i;
		}
		System.out.println("Addition of first 10 numbers are: "+sum);
		System.out.println("Multiplication of first 10 numbers are: "+mul);
	}

}
