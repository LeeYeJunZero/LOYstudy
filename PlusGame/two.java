package javaaa;

import java.util.Random;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Random rd = new Random(); // 랜덤 값을 저장하는 rd 객체 생성
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
        
        while (true) {
            int[][] wrong = new int[10][2]; // 틀린 문제를 저장할 2차원 배열
                                            // 10개의 열과 2개의 행을 가진 2차원 배열
            int score = 0; // 사용자의 성적을 저장할 변수
            
            for (int i = 0; i < 10; i++) {
                int bound = 100; // 범위를 0부터 99까지로 설정

                int num1 = rd.nextInt(bound); // 랜덤 숫자 생성
                int num2 = rd.nextInt(bound); // 랜덤 숫자 생성
                System.out.println(num1 + " + " + num2 + " 는 얼마입니까?");

                int userAnswer = sc.nextInt(); // 사용자 입력 받기

                if (userAnswer == num1 + num2) { // 만약 문제가 정답이라면
                    System.out.println("맞았습니다.");
                    score += 10; // 맞은 문제일 경우 10점 추가
                } else {
                    System.out.println("틀렸습니다. 다시 풀어보세요.");
                    // 틀린 문제 저장
                    wrong[i][0] = num1; // 오답을 저장할 첫 번째 열
                    wrong[i][1] = num2; // 오답을 저장할 두 번째 열
                }
                System.out.println((10 - i - 1) + " 문제 남았습니다");
            }
            System.out.println("문제 끝");

            // 사용자의 성적 출력
            System.out.println("당신의 성적: " + score);

            // 틀린 문제 다시 풀기
            System.out.println("틀린 문제 다시 풀기:");
            for (int i = 0; i < 10; i++) {
                int[] usermiss1 = wrong[i]; // wrong 배열의 i번째 참조
                if (usermiss1[0] == 0 && usermiss1[1] == 0) { // 틀린 문제가 없으면
                    break;
                }
                System.out.println("틀린 문제 " + (i + 1) + ": " + usermiss1[0] + " + " + usermiss1[1] + " = ?");
                System.out.println("정답을 입력하세요:");
                int correctAnswer = usermiss1[0] + usermiss1[1]; // 배열에 저장된 문제의 답을 correctAnswer에 대입
                int retryAnswer = sc.nextInt(); // 사용자 입력 받기
                if (retryAnswer == correctAnswer) { // 다시 시도한 값과 문제의 값이 일치하는가?
                    System.out.println("맞았습니다.");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + correctAnswer + "입니다.");
                }
            }

            // 최종 사용자의 성적 출력
            System.out.println("최종 성적: " + score);
            System.out.println(" ");

            System.out.println("다시 플레이 하시겠습니까? y/n ");
            sc.nextLine(); // 남은 개행 문자를 소비
            String line = sc.nextLine();
            if (line.equals("n")) {
                break;
            }
        }
       
    }
}
