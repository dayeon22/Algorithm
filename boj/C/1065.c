#include <stdio.h>

int is_han(int num)
{
	int temp;
	int diff;

	temp = num % 10;
	diff = temp - (num / 10 % 10);
	while (num >= 10)
	{
		temp = num % 10;
		num /= 10;
		if (diff != (temp - num % 10))
			return (0);
	}
	return (1);
}

int main()
{
	int n;
	int cnt = 0;

	scanf("%d", &n);
	for (int i = 1; i <= n; i++)
	{
		if (is_han(i) == 1)
			cnt++;
	}
	printf("%d\n", cnt);
}
