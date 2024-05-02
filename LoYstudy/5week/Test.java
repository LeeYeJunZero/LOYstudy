import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        String []name; // 배열
        int [][]score; // 2차원 배열
        float []avg; // 배열

        int n=0; // n초기화

        Scanner sc = new Scanner((System.in));
        System.out.print("Count :");
        n = sc.nextInt(); // n은 사용자가 입력 카운트를 나타냄

        name = new String[n]; // 길이가 n인 문자열 배열 객체 name 생성 만약 카운트가 3이라면 0 1 2 3까지의 배열을 만듦
        score = new int[n][4]; // 길이가 n인 4열의 2차원 배열 객체 생성
        avg = new float[n]; // 길이가 n인 실수형 배열 객체 avg 생성

        for(int i = 0; i<n; i++){ // i가 n될때까지
            System.out.println("이름"); // 추가함
            name[i]=sc.next();//입력 받은 값 중 공백 전까지 문자열로 반환
            for(int j=0;j<(score[i].length)-1; j++){//score의 문자열 값에서 -1한 값까지 반복
                System.out.println("점수 입력"); // 추가함
                score[i][j] = sc.nextInt(); // i행 j열 0번, 1번 , 2번에 사용자의 입력값을 저장함
                score[i][3] += score[i][j]; // I행 J열 3번에 총합 저장
            }
            avg[i] = score[i][3]/3.0f; // 총합을 3으로 나누기
        }
        for(int i=0;i<n;i++){ // i가 입력받은 n만큼 반복
            System.out.println("name : " +name[i]);//name은 문자열 형태의 배열 객체로 저장돼있음 i가 반복되며 i의 첫번째, 두번재 세번째 주소를 리턴함
            System.out.println("score1 : " + score[i][0] );//score i헹 j 0번
            System.out.println("score2 : " + score[i][1]);// i행 j 1번
            System.out.println("score3 : " + score[i][2]);//i행 j 2번
            System.out.println("total : " + score[i][3]);//total은 i행 j 3번에 저장 해놨기에 그 값 리턴
            System.out.println("average : " + avg[i]);//총합 반환
        }
    }
}
