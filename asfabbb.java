package jump;

import java.util.Scanner;

public class asfabbb {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("수가 정해졌다.(1~100)");

        int randnum = (int) (Math.random() * 100) + 1; // 1부터 100까지의 무작위 수 생성

        int andnum;
        Scanner sc = new Scanner(System.in);

        while (true) {
            andnum = sc.nextInt(); // 사용자 입력 받기
            if (randnum == andnum) {
                System.out.println("정답");
                break; // 정답을 맞추면 루프 종료
            } else if (randnum > andnum) {
                System.out.println("더 높게");
            } else {
                System.out.println("더 낮게");
            }
        }
    }
}
