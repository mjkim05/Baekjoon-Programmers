//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B
//70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        
        if(grade >= 90 && grade <= 100)
            System.out.print("A");
        else if(grade >= 80)
            System.out.print("B");
        else if(grade >= 70)
            System.out.print("C");
        else if(grade >= 60)
            System.out.print("D");
        else 
            System.out.print("F");
    } 
}