import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 	// n바이트
		StringBuffer sb = new StringBuffer();
		String result ="";
		for (int i = 0; i<(n/4); i++)
		{
			sb.append("long ");
		}
		
		result += sb.toString();
		result += "int";
		System.out.println(result);
	}
}
