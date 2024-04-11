import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("높이 : ");
        int num = sc.nextInt();
        for(int i=1;i<num;i++){//i는 1부터 시작해서 num까지
            for(int j=num-1;j>0;j--){//j는 입력값 num-1을 주고 j가 0이 될때까지 감소
                if(i<j){//만약 j가 더 크다면 공백 출력
                    System.out.print(" ");
                }else{
                    System.out.print("*");//아니라면 별 출력
                }
            }
            System.out.println("    ");
        }

    }
}
