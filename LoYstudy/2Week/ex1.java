import java.util.Scanner;

public class ex1 {

        public static int add(int number1, int number2) { //이름, 매개변수 선언
            return (number1 * number2) / 2;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("밑변 입력 : ");
            int num1 = sc.nextInt();
            System.out.println(" ");
            System.out.print("높이 입력 : ");
            int num2 = sc.nextInt();
            System.out.println(" ");
            int result = add(num1, num2);

            System.out.println("면적은 " + result + "입니다.");
        }
    }

