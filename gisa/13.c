#include <stdio.h>

int main()
{
	int i = 1;
	int j = 1;
	int sum = 0;

	do
	{
		sum += i;
		i += j;
		j++;
	}while (j <= 20);
	printf("%d", sum);
}
