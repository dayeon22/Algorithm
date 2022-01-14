#include <stdio.h>

int main()
{
	int i = 1;
	int fac = 1;
	int sum = 0;

	do
	{
		sum += fac;
		fac *= ++i;
	}while (i <= 10);
	printf("%d", sum);
}
