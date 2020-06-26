import java.util.*;
public class Calculator 
{
	static double powerInt(int num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println(powerInt(num1,num2));
	}
}
