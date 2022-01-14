#include <stdio.h>

int main()
{
	int i = 0;
	int sum = 0;
	int sign = 1;

	do
	{
		sum += i++ * sign;
		sign *= -1;
	}while (i < 100);

	printf("%d", sum);
}
