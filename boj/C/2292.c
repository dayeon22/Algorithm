#include <stdio.h>

int main()
{
	int input;
	int num = 1, add = 6, cnt = 0;

	scanf("%d", &input);
	while (input > num)
	{
		num += add;
		add += 6;
		cnt++;
	}
	printf("%d", cnt + 1);
}
