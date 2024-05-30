import java.io.EOFException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		} while (sc.hasNext());	// 입력 값이 더 있는지 확인 후 없으면 종료
	}
}