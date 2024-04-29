#include<stdio.h>
#include<stdlib.h>

struct student {
    char name[20];
    char phone[10];
    char gender;
    int score;
}; // 구조체 정적 할당

int main() {
    int a, b; // 각 4바이트 씩 할당 메모리에 정적할당으로 a 4바이트 b 4바이트
    struct student student1, student2; // 메모리에 student1과 student2에 35바이트씩 잡힘 
    a = 5; // 5로 초기화
    student1.score = 100; // 멤버변수 score에 접근 후 score를 100으로 초기화
    student1.gender = 'F'; // 'F'로 초기화

    student2.score = 85; 
    student2.gender = 'M'; // 'M'으로 초기화

    return 0;
}
