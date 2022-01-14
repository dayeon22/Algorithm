#include <stdio.h>

int main()
{
	int i = 1;
	double sum = 0;
	int sign = -1;

	do
	{
		sum += sign * ((double)i / (i + 1));
		sign *= -1;
		i++;
	}while (i < 100);
	printf("%lf", sum);
}
