#include <stdio.h>

int self_number(int num)
{
	int temp;
	int sum;

	for (int i = 1; i < num; i++)
	{
		temp = i;
		sum = 0;
		while (temp)
		{
			sum += temp % 10;
			temp /= 10;
		}
		if (sum + i == num)
			return (0);
	}
	return (1);
}

int main()
{
	for (int i = 1; i < 10000; i++)
	{
		if (self_number(i) == 1)
			printf("%d\n", i);
	}
}
