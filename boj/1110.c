#include <stdio.h>

int main()
{
	int input;
	int temp;
	int cnt = 0;

	scanf("%d", &input);
	temp = input;
	do
	{
		temp = (temp % 10) * 10 + (temp / 10 + temp % 10) % 10;
		cnt++;
	}while (temp != input);
	printf("%d", cnt);
}
