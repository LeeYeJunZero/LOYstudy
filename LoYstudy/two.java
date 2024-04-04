import java.util.Scanner;

public class two {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
double radius;
    System.out.print("반지름 입력 :");
    radius = sc.nextInt();

    System.out.println("원의 둘레 :" +2*3.14*radius);
        System.out.print("원의 면적 :" +3.14*radius*radius);
    }
}