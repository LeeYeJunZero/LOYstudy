	package jump;

	import java.util.Random;
	import java.util.Scanner;

	public class homework {
	    public static void main(String[] args) {
	        Random rd = new Random();
	        Scanner sc = new Scanner(System.in);
	        int bound = 100; // 범위를 0부터 99까지로 설정

	        int num1 = rd.nextInt(bound);
	        int num2 = rd.nextInt(bound);
	        
	        System.out.println(num1 + "+" + num2 + "는 얼마입니까?");
	        
	        int userAnswer = sc.nextInt();

	        checkAnswer(userAnswer, num1, num2);
	    }
	    
	    public static void checkAnswer(int userAnswer, int num1, int num2) { // 계산 부분 함수화
	        if(userAnswer == num1 + num2) {
	            System.out.println("맞았습니다.");
	        } else {
	            System.out.println("틀렸습니다.");
	        }
	    }
	}
