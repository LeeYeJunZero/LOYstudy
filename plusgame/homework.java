package jump;

import java.util.Random;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int[] userAnswers = new int[10]; // 사용자 답변을 저장할 배열
        int[] userMistakes = new int[10]; // 사용자 오답 여부를 저장할 배열
        int mistakeCount = 0; // 틀린 문제의 개수를 저장할 변수
        int score = 0; // 사용자의 성적을 저장할 변수

        for (int i = 0; i < 10; i++) {
            int bound = 100; // 범위를 0부터 99까지로 설정

            int num1 = rd.nextInt(bound);
            int num2 = rd.nextInt(bound);
            System.out.println(num1 + " + " + num2 + " 는 얼마입니까?");

            int userAnswer = sc.nextInt();
            userAnswers[i] = userAnswer; // 배열에 사용자 답변 저장

            if (userAnswer == num1 + num2) {
                System.out.println("맞았습니다.");
                score += 10; // 맞은 문제일 경우 10점 추가
            } else {
                System.out.println("틀렸습니다.");
                userMistakes[mistakeCount++] = i; // 틀린 문제의 인덱스를 저장하고 mistakeCount 증가
            }
            System.out.println((10 - i - 1) + " 문제 남았습니다");
        }
        System.out.println("문제 끝");

        // 사용자의 성적 출력
        System.out.println("당신의 성적: " + score);

        // 틀린 문제 출력
        System.out.println("틀린 문제:");
        for (int i = 0; i < mistakeCount; i++) {
            int mistakeIndex = userMistakes[i];
            System.out.println((mistakeIndex + 1) + "번째 문제: " + userAnswers[mistakeIndex]);
        }
    }
}
