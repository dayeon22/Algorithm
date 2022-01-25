#include <stdio.h>

int prime_number(int num)
{
	int i;

	if (num == 1)
		return 0;
	for (i = 2; i < num; i++)
	{
		if (num % i == 0)
			return 0;
	}
	return 1;
}

int main()
{
	int n, i, num, res = 0;

	scanf("%d", &n);
	for (i = 0; i < n; i++)
	{
		scanf("%d", &num);
		res += prime_number(num);
	}
	printf("%d", res);
}
