#include <stdio.h>

int get_sum(int num)
{
	int sum = num;

	while (num)
	{
		sum += num % 10;
		num /= 10;
	}
	return (sum);
}

int main()
{
	int arr[10001];
	int i;
	int sum;

	for (i = 1; i < 10001; i++)
		arr[i] = 0;
	for (i = 1; i < 10001; i++)
	{
		if ((sum = get_sum(i)) < 10001)
			arr[sum] = 1;
	}
	for (i = 1; i < 10001; i++)
	{
		if (arr[i] != 1)
			printf("%d\n", i);
	}
}
