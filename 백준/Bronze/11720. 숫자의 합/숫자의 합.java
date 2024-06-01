import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		String temp = sc.next();
		for (int i = 0; i <n; i++)
			sum += (temp.charAt(i)-48);	// 유니코드이기때문에 -48
		System.out.println(sum);
	}
}