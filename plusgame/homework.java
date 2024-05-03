package jump;

import java.util.Random;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int[] userAnswers = new int[10]; // 사용자 답변을 저장할 배열

        for (int i = 0; i < 10; i++) {
            int bound = 100; // 범위를 0부터 99까지로 설정
            int score = 0;
            int num1 = rd.nextInt(bound);
            int num2 = rd.nextInt(bound);
            System.out.println(num1 + " + " + num2 + " 는 얼마입니까?");

            int userAnswer = sc.nextInt();
            userAnswers[i] = userAnswer; // 배열에 사용자 답변 저장
            System.out.println((10 - i - 1) + " 문제 남았습니다");

            checkAnswer(userAnswer, num1, num2);
        }
        System.out.println("문제 끝");

        // 사용자의 모든 답변 출력
        System.out.println("당신의 답안:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "번째 답변: " + userAnswers[i]);
        }
    }

    public static void checkAnswer(int userAnswer, int num1, int num2) {
        if (userAnswer == num1 + num2) {
            System.out.println("맞았습니다.");
        } else {
            System.out.println("틀렸습니다.");
        }
    }
}
