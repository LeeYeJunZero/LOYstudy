#include<stdio.h>

int main() {
	/*int n;
	printf("학생수 입력 :");
	scanf("%d", &n);
	int score[n];*/
	/*에러나는 이유 : 배열은 컴파일 하는 도중 메모리의 크기가 정해져야 하는데(정적할당)
	n은 런타임 중 메모리의 크기를 할당 받기에 불가능함

	*/
	/*stack과 data영역은 컴파일 중 메모리 크기를 할당 받아야 하는 영역
	 
	heap 영역은 런타임 중 할당 받을 수 있는 영역
	stack - 지역변수, 매개변수
	heap - 동적 메모리
	data - 전역변수, static변수

	malloc - memory allocation
	*/
	int* score;
	int n;
	printf("학생수 입력 :");
	scanf_s("%d", &n);
	
	score =(int*) malloc(n * sizeof(int));//malloc은 동적할당 후 주소 값을 리턴함 리턴 받는 주소값을 포인터 score로 받는다고 지정
		//기본적으로 void 포인터를 리턴함 리턴 받기 전에 형 변환을 반드시 거쳐야함 
	
	//동적할당된 메모리를 제거 하지 않으면 메모리 leak(누수)가 발생하기에 반드시 free로 제거 해야함
	free(*score);//포인터를 제거하는게 아닌, 포인터가 가진 메모리를 제거함
	}