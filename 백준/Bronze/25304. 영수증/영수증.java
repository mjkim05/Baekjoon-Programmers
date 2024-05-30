import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // 총금액
		int n = sc.nextInt(); // 물건 종류의 수
		int sum = 0;		  // 계산 합계
		
		for (int i=0; i<n; i++)
		{
			int a = sc.nextInt();	// 금액
			int b = sc.nextInt(); 	// 개수
			
			sum += (a*b);
		} 
		
		if(sum == x)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}