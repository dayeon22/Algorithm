#include <stdio.h>

int main()
{
	int temp;
	int cnt = 0;
	int first = 1;
	int second = 1;
	int sum = 2;

	while (cnt < 18)
	{
		temp = first + second;
		first = second;
		second = temp;
		sum += second;
		cnt++;
	}
	printf("%d", sum);
}
