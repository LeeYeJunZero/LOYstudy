#include<stdio.h>
#include<stdlib.h>

struct student {
    char name[20];
    char phone[10];
    char gender;
    int score;
}; // ����ü ���� �Ҵ�

int main() {
    int a, b; // �� 4����Ʈ �� �Ҵ� �޸𸮿� �����Ҵ����� a 4����Ʈ b 4����Ʈ
    struct student student1, student2; // �޸𸮿� student1�� student2�� 35����Ʈ�� ���� 
    a = 5; // 5�� �ʱ�ȭ
    student1.score = 100; // ������� score�� ���� �� score�� 100���� �ʱ�ȭ
    student1.gender = 'F'; // 'F'�� �ʱ�ȭ

    student2.score = 85; 
    student2.gender = 'M'; // 'M'���� �ʱ�ȭ

    return 0;
}
