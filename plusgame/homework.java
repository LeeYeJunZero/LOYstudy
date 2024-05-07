package javaaa;

import java.util.Random;
import java.util.Scanner;

public class nanana {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] wrong = new int[10][2]; // 틀린 문제를 저장할 2차원 배열

        int score = 0; // 사용자의 성적을 저장할 변수

        for (int i = 0; i < 10; i++) {
            int bound = 100; // 범위를 0부터 99까지로 설정

            int num1 = rd.nextInt(bound);
            int num2 = rd.nextInt(bound);
            System.out.println(num1 + " + " + num2 + " 는 얼마입니까?");

            int userAnswer = sc.nextInt();

            if (userAnswer == num1 + num2) {
                System.out.println("맞았습니다.");
                score += 10; // 맞은 문제일 경우 10점 추가
            } else {
                System.out.println("틀렸습니다. 다시 풀어보세요.");
                // 틀린 문제 저장
                wrong[i][0] = num1;
                wrong[i][1] = num2;
            }
            System.out.println((10 - i - 1) + " 문제 남았습니다");
        }
        System.out.println("문제 끝");

        // 사용자의 성적 출력
        System.out.println("당신의 성적: " + score);

        // 틀린 문제 다시 풀기
        System.out.println("틀린 문제 다시 풀기:");
        for (int i = 0; i < 10; i++) {
            int[] usermiss = wrong[i];
            if (usermiss[0] == 0 && usermiss[1] == 0) {
                // 틀린 문제가 없는 경우
                break;
            }
            System.out.println("틀린 문제 " + (i + 1) + ": " + usermiss[0] + " + " + usermiss[1] + " = ?");
            System.out.println("정답을 입력하세요:");
            int correctAnswer = usermiss[0] + usermiss[1];
            int retryAnswer = sc.nextInt(); // 사용자 입력 받기
            if (retryAnswer == correctAnswer) {
                System.out.println("맞았습니다.");
                score += 5; // 다시 맞춘 문제일 경우 추가 점수 부여
            } else {
                System.out.println("틀렸습니다. 정답은 " + correctAnswer + "입니다.");
            }
        }

        // 최종 사용자의 성적 출력
        System.out.println("최종 성적: " + score);
    }
}
