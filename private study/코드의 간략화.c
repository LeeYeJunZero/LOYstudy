#include<stdio.h>


int main() {
	int i, j;

	for (i = 1; i <= 9; i++)
	{
		
		for (j = 1; j <= i; j++) {
			printf("%d", i % 2);
		//	if (i % 2 == 1) {
			//	printf("%d", 1);
		//	}
		//	else{
		//	printf("%d",0);
		//	}
		}
		printf("\n");
	}

	return 0;
}